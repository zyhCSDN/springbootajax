package org.springboot.direct;

/**
 * @author: zyh
 * @date: 2019/4/10 0010
 * @company: kaixingkeji
 */
public class Man implements Runnable {

    private Bank bank = new Bank();

    @Override
    public void run() {
        int m = 100;
        int i = 0;
        while (i < 5) {
            bank.saveMoney(m);
            i++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
