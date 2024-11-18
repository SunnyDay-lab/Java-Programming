public class Circle2 {
    double radius;  // 圆的半径
    static int numberOfObjects = 0;  // 静态变量，用于跟踪创建的 Circle2 对象数量

    // 默认构造函数
    Circle2() {
        radius = 1;  // 设置默认半径为 1
        numberOfObjects++;  // 每创建一个对象，numberOfObjects 增加 1
    }

    // 带一个整数参数的构造函数
    public Circle2(int i) {
        radius = i;  // 将传入的参数 i 用作圆的半径
        numberOfObjects++;  // 每创建一个对象，numberOfObjects 增加 1
    }

    // 静态方法，用于获取当前创建的 Circle2 对象的数量
    static int getNumberOfObjects() {
        return numberOfObjects;  // 返回静态变量 numberOfObjects 的值
    }

    // 实例方法，计算当前圆的面积
    double getArea() {
        return radius * radius * Math.PI;  // 返回圆的面积，公式为 π * r^2
    }
}
