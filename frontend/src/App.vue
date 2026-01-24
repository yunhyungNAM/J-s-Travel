<template>
  <div class="app-container">
    <router-view />
  </div>
</template>

<style>
.app-container {
  max-width: 430px; /* iPhone Pro Max 기준 */
  margin: 0 auto;
  min-height: 100vh;
  border: 1px solid #eee; /* 개발 중에만 */
}
</style>
