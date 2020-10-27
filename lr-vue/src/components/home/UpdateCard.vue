<template>
  <el-card class="box-card">
    <div slot="header" class="clearfix">
      <span style="font-weight: bold;font-size: 20px">最近更新</span>
      <!--<el-button style="float: right; padding: 3px 0" type="text">修改</el-button>-->
    </div>
    <div class="block">
      <el-timeline>
        <el-timeline-item timestamp="2020/10/26" placement="top">
          <el-card>
            <h4>解决搜索异常的BUG</h4>
            <p>Lcy 提交于 2020/10/26 14:32</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2020/10/25" placement="top">
          <el-card>
            <h4>发现BUG 尝试解决并回顾项目内容</h4>
            <p>Lcy 提交于 2020/10/25 11:49</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2020/10/22" placement="top">
          <el-card>
            <h4>实现图书分类功能</h4>
            <p>Lcy 提交于 2020/10/22 09:02</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2020/10/19" placement="top">
          <el-card>
            <h4>建立图书馆，添加图书馆功能</h4>
            <p>Lcy 提交于 2020/10/20 22:10</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2020/10/19" placement="top">
          <el-card>
            <h4>完善主页内容</h4>
            <p>Lcy 提交于 2020/10/19 20:03</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2020/10/18" placement="top">
          <el-card>
            <h4>建立图书馆</h4>
            <p>Lcy 提交于 2020/10/18 22:52</p>
          </el-card>
        </el-timeline-item>
      </el-timeline>
    </div>
  </el-card>
</template>

<script>
  export default {
    name: 'UpdateCard'
  }
</script>

<style scoped>
  .box-card {
    margin-top: 5px;
    width: 988px;
    /*height: 1050px;*/
    text-align: left;
  }
</style>
