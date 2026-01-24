import axios from './axios'

export function fetchTravelList(userId) {
  return axios.get('/travels/list', {
    params: { userId },
  })
}
