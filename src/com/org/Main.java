package com.org;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
 /*       Main main=new Main();
      int result=  getSum(6);
        System.out.println(result);*/

/*        int result = highestOneBit(16);
        System.out.println(result);*/

        HashMap<Integer,String> l=new HashMap<>();
        for (int i=0;i<100;i++){
            l.put(i,"v");
        }

        System.out.println(l.size());


    }

    public static int highestOneBit(int i) {
        // HD, Figure 3-1
        i |= (i >> 1);
        i |= (i >> 2);
        i |= (i >> 4);
        i |= (i >> 8);
        i |= (i >> 16);

       // return i;
        return i - (i >>> 1);
    }


    public static int getSum(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int left = 1;
        int right = 2;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = left + right;
            left = right;
            right = result;
        }
        return result;
    }


    int k = 0;

    public void ex(int A, int B) {
        if (A % B == 0) {
            return;
        } else {
            k++;
            int mo = A % B;
            ex(B, mo);
        }
    }

    public char winner(int A, int B) {
        ex(A, B);
        return k % 2 == 0 ? 'A' : 'B';
    }


    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer k = numMap.get(target - nums[i]);
            if (k != null) {
                result[0] = i;
                result[1] = k;
                return result;
            }
        }
        return result;
    }

    private void k() throws Exception {
        ServerSocket socket = new ServerSocket(9090);
        System.out.println("begin ..");
        while (true) {
            Socket socket1 = socket.accept();
            String ip = "" + socket1.getInetAddress() + socket1.getPort();
            InputStream inputStream = socket1.getInputStream();
            String result = "";
            String line = "";
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader br = new BufferedReader(inputStreamReader);
            while ((line = br.readLine()) != null) {
                result += line;
            }
            System.out.println(result);
        }
    }

    public static int countWays(int[] penny, int n, int aim) {
        int[][] dp = new int[n][aim + 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i <= aim; i++) {
            if (i % penny[0] == 0) {
                dp[0][i] = 1;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= aim; j++) {
                if ((j - penny[i]) >= 0)
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - penny[i]];
                // else dp[i][j]=
            }
        }
        return dp[n - 1][aim];
    }

    public static int sol(int[] arr, int index, int aim, int[][] map) {
        if (index == arr.length || aim <= 0) {
            return aim == 0 ? 1 : 0;
        }
        int result = 0;
        int mapValue = 0;
        for (int i = 0; i <= aim / arr[index]; i++) {
            mapValue = map[index + 1][aim - arr[index] * i];
            if (mapValue != 0) {
                result += mapValue == -1 ? 0 : mapValue;
            } else {
                result = result + sol(arr, index + 1, aim - arr[index] * i, map);
            }
        }
        map[index][aim] = result == 0 ? -1 : result;
        return result;
    }
}
