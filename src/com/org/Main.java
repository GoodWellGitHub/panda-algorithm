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

        int arr[] = {3, 2, 4};
        int[] result = twoSum(arr, 6);
        Stream.of(result).forEach(System.out::println);
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
}
