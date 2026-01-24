<template>
  <div class="container">
    <h1>여행 목록</h1>

    <div v-if="loading">불러오는 중...</div>

    <div v-if="error" class="error">
      {{ error }}
    </div>

    <ul v-if="travels.length">
      <li v-for="travel in travels" :key="travel.travelId">
        <h3>{{ travel.name }}</h3>
        <p>{{ travel.startDate }} ~ {{ travel.endDate }}</p>
      </li>
    </ul>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import { fetchTravelList } from '@/api/travel'

const travels = ref([])
const loading = ref(false)
const error = ref(null)

onMounted(async () => {
  loading.value = true
  try {
    const response = await fetchTravelList(3)
    travels.value = response.data
    console.log('여행 목록 응답:', response.data)
  } catch (e) {
    error.value = '여행 목록을 불러오지 못했습니다.'
    console.error(e)
  } finally {
    loading.value = false
  }
})
</script>

<style scoped>
.container {
  max-width: 420px;
  margin: 0 auto;
  padding: 16px;
}

li {
  border: 1px solid #eee;
  border-radius: 8px;
  padding: 12px;
  margin-bottom: 8px;
}

.error {
  color: red;
}
</style>
