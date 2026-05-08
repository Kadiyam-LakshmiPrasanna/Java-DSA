public class BinarySearch {
        public static int search(int[] arr, int target) {
                    int left = 0;
                            int right = arr.length - 1;

                                    while (left <= right) {
                                                    int mid = left + (right - left) / 2; // Find the middle index

                                                                if (arr[mid] == target) {
                                                                                    return mid; // Target found!
                                                                }

                                                                            if (arr[mid] < target) {
                                                                                                left = mid + 1; // Search the right half
                                                                            } else {
                                                                                                right = mid - 1; // Search the left half
                                                                            }
                                    }
                                            return -1; // Target not found
        }

            public static void main(String[] args) {
                        int[] myNumbers = {10, 20, 30, 40, 50}; // Array MUST be sorted
                                int target = 40;
                                        
                                                int result = search(myNumbers, target);
                                                        
                                                                if (result != -1) {
                                                                                System.out.println("Element found at index: " + result);
                                                                } else {
                                                                                System.out.println("Element not found.");
                                                                }
            }
}

                                                                }
                                                                }
            }
                                                                            }
                                                                            }
                                                                }
                                    }
        }
}