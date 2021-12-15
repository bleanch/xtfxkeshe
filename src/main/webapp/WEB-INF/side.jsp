<%@ page pageEncoding="UTF-8" %>

<div class="layui-side-scroll">
    <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
    <ul class="layui-nav layui-nav-tree" lay-filter="test">
        <li class="layui-nav-item layui-nav-itemed">
            <a href="javascript:;">客户管理</a>
            <dl class="layui-nav-child">
                <dd><a href="index?n=1">客户列表</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item">
            <a href="javascript:;">运维团队管理</a>
            <dl class="layui-nav-child">
                <dd><a href="index?n=2">团队列表</a></dd>
                <dd><a href="index?n=3">团队成员列表</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item">
            <a href="javascript:;">申请订单</a>
            <dl class="layui-nav-child">
                <dd><a href="index?n=4">申请列表</a></dd>
            </dl>
        </li>

        <li class="layui-nav-item">
            <a href="javascript:;">项目评价</a>
            <dl class="layui-nav-child">
                <dd><a href="index?n=5">评价列表</a></dd>
            </dl>
        </li>
    </ul>
</div>
</div>
