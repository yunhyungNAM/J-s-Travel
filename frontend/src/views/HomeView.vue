<template>
  <div class="container">
    <!-- Header -->
    <header class="header">
      <div class="logo">TRAVEL</div>
      <button class="logout-btn">로그아웃</button>
    </header>

    <!-- Travel Info -->
    <section class="travel-info">
      <h1 class="travel-title">{{ travel.name }}</h1>
      <p class="travel-period">{{ travel.startDate }} ~ {{ travel.endDate }}</p>
    </section>

    <!-- Date & Expenses -->
    <section v-for="date in expensesByDate" :key="date.date" class="date-section">
      <div class="date-header">
        <h2>{{ date.date }}</h2>
        <button class="add-btn">일정 추가</button>
      </div>

      <div v-for="expense in date.expenses" :key="expense.id" class="expense-card">
        <div class="expense-row">
          <span class="city">{{ expense.city }}</span>
          <span class="time">{{ expense.time }}</span>
          <span class="category">{{ expense.category }}</span>
          <span class="amount">{{ expense.amount }} {{ expense.currency }}</span>
          <button class="detail-btn" @click="toggleDetail(expense)">상세</button>
        </div>

        <div v-if="expense.showDetail" class="expense-detail">
          <p>비고: {{ expense.memo }}</p>
          <p>환율 적용 금액: ₩ {{ expense.convertedAmount }}</p>
        </div>
      </div>
    </section>

    <!-- Bottom Navigation -->
    <nav class="bottom-nav">
      <button @click="$router.push('/travels')">여행 목록</button>
      <button>My</button>
    </nav>
  </div>
</template>

<script setup>
import { reactive } from 'vue'

const travel = reactive({
  name: '도쿄 여행',
  startDate: '2026-02-01',
  endDate: '2026-02-05',
})

const expensesByDate = reactive([
  {
    date: '2026-02-01',
    expenses: [
      {
        id: 1,
        city: '도쿄',
        time: '12:30',
        category: '식사',
        amount: 1200,
        currency: 'JPY',
        memo: '라멘 맛집',
        convertedAmount: '11,200',
        showDetail: false,
      },
      {
        id: 2,
        city: '도쿄',
        time: '18:00',
        category: '교통',
        amount: 500,
        currency: 'JPY',
        memo: '지하철',
        convertedAmount: '4,600',
        showDetail: false,
      },
    ],
  },
])

function toggleDetail(expense) {
  expense.showDetail = !expense.showDetail
}
</script>

<style scoped>
/* Layout */
.container {
  max-width: 420px;
  margin: 0 auto;
  padding-bottom: 80px;
  font-family:
    system-ui,
    -apple-system,
    BlinkMacSystemFont;
}

/* Header */
.header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 12px 16px;
  border-bottom: 1px solid #eee;
}

.logo {
  font-weight: bold;
  font-size: 18px;
}

.logout-btn {
  font-size: 12px;
  background: none;
  border: none;
  color: #666;
}

/* Travel Info */
.travel-info {
  text-align: center;
  padding: 16px;
}

.travel-title {
  margin: 0;
  font-size: 20px;
}

.travel-period {
  color: #777;
  font-size: 14px;
}

/* Date Section */
.date-section {
  padding: 0 16px;
}

.date-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-top: 16px;
}

.add-btn {
  font-size: 12px;
  padding: 4px 8px;
}

/* Expense */
.expense-card {
  border: 1px solid #eee;
  border-radius: 8px;
  margin-top: 8px;
  padding: 8px;
}

.expense-row {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr 1fr auto;
  gap: 6px;
  align-items: center;
  font-size: 12px;
}

.detail-btn {
  font-size: 11px;
}

.expense-detail {
  margin-top: 8px;
  padding-top: 8px;
  border-top: 1px dashed #ddd;
  font-size: 12px;
  color: #555;
}

/* Bottom Nav */
.bottom-nav {
  position: fixed;
  bottom: 0;
  left: 0;
  right: 0;
  max-width: 420px;
  margin: 0 auto;
  display: flex;
  justify-content: space-around;
  border-top: 1px solid #eee;
  background: #fff;
  padding: 12px 0;
}
</style>
