package com.pattern.bridge;

/*
我们假设有一座桥，桥左边为A，桥右边为B，A有A1，A2，A3等，表示桥左边的三个不同地方，B有B1，B2，B3等，
表示桥右边的三个不同地方，假设我们要从桥左侧A出发到桥的右侧B，我们可以有多重方案，A1到B1，A1到B2，A1到B3，A2到B1...等等
 */
public interface Qiao {
    void targetAreaB();

}
