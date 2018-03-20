package freestar.vip.pandaking;

import vip.freestar.mylogger.Logger;

/**
 * 描述：
 * 作者：一颗浪星
 * 日期：2018/2/28
 * github：
 */
public class MyRun implements Runnable {

    @Override
    public void run() {
        Logger.e("name");
        int i=0;
        while (i<1000){
            i++;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
