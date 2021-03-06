<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
        <meta name="format-detection" content="telephone=no">
        <meta charset="UTF-8">

        <meta name="description" content="Violate Responsive Admin Template">
        <meta name="keywords" content="Super Admin, Admin, Template, Bootstrap">

        <title>看蒸气</title>
            
        <!-- CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/animate.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/form.css" rel="stylesheet">
        <link href="css/calendar.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <link href="css/icons.css" rel="stylesheet">
        <link href="css/generics.css" rel="stylesheet"> 
    </head>
    <body id="skin-blur-violate">

        <header id="header" class="media">
            <a href="" id="menu-toggle"></a> 
            <a class="logo pull-left" href="#">LOOKSTEAM</a>

            <div class="media-body" id="top-menu">
                <div id="time" class="pull-right">
                    <span id="hours"></span>
                    :
                    <span id="min"></span>
                    :
                    <span id="sec"></span>
                </div>
            </div>


             <h4 style="margin: 0; padding-top: 15px;">我的主页</h4>
        </header>
        
        <div class="clearfix"></div>
        
        <section id="main" class="p-relative" role="main">
            
            <!-- Sidebar -->
            <aside id="sidebar">
                
                <!-- Sidbar Widgets -->
                <div class="side-widgets overflow">
                    <!-- Profile Menu -->
                    <div class="text-center s-widget m-b-25 dropdown" id="profile-menu">
                        <a href="" data-toggle="dropdown">
                            <img class="profile-pic animated" src="img/profile-pic.jpg" alt="">
                        </a>
                        <ul class="dropdown-menu profile-menu">
                            <li><a href="#">待定页面</a> <i class="icon left">&#61903;</i><i class="icon right">&#61815;</i></li>
                            <li><a href="">待定页面</a> <i class="icon left">&#61903;</i><i class="icon right">&#61815;</i></li>
                            <li><a href="#">待定页面</a> <i class="icon left">&#61903;</i><i class="icon right">&#61815;</i></li>
                            <li><a href="login.jsp">登出</a> <i class="icon left">&#61903;</i><i class="icon right">&#61815;</i></li>
                        </ul>
                        <h4 class="m-0">Malinda Hollaway</h4>
                        @malinda-h
                    </div>
                    
                    <!-- Calendar -->
                    <div class="s-widget m-b-25">
                        <div id="sidebar-calendar"></div>
                    </div>
                    
                    <!-- Feeds -->
                    <div class="s-widget m-b-25">
                        <h2 class="tile-title">
                           本站简介
                        </h2>
                        <ul style="margin: 10px;">
                            <li style="margin: 5px;">优化页面加载速度</li>
                            <li style="margin: 5px;">完成好友页面设计</li>
                            <li style="margin: 5px;">完成成就页面设计</li>
                            <li style="margin: 5px;">增加用户昵称登入</li>
                            <li style="margin: 5px;">...</li>
                        </ul>

                        <div class="s-widget-body">
                            <div id="news-feed"></div>
                        </div>
                    </div>
                    
                    <!-- Projects -->
                </div>
                
                <!-- Side Menu -->
                <ul class="list-unstyled side-menu">
                    <li>
                        <a class="icon" href="tables.html">
                            <div style="font-size: 25px;">&#61713</div><span class="menu-item">首页</span>
                        </a>
                    </li>
                    <li>
                        <a class="icon" href="tables.html">
                            <div style="font-size: 25px;">&#61902</div><span class="menu-item">我的游戏</span>
                        </a>
                    </li>
                    <li>
                        <a class="icon" href="tables.html">
                            <div style="font-size: 25px;">&#61887</div><span class="menu-item">我的好友</span>
                        </a>
                    </li>
                </ul>

            </aside>
        
            <!-- Content -->
            <section id="content" class="container">
            
                
                <div class="block-area shortcut-area">
                    <a class="shortcut tile" href="">
                        <img src="img/shortcuts/money.png" alt="">
                        <small class="t-overflow">游戏价值</small>
                    </a>
                    <a class="shortcut tile" href="">
                        <img src="img/shortcuts/calendar.png" alt="">
                        <small class="t-overflow">成就信息</small>
                    </a>
                    <a class="shortcut tile" href="">
                        <img src="img/shortcuts/stats.png" alt="">
                        <small class="t-overflow">游戏统计</small>
                    </a>
                    <a class="shortcut tile" href="">
                        <img src="img/shortcuts/reports.png" alt="">
                        <small class="t-overflow">好友统计</small>
                    </a>
                </div>
                
                <hr class="whiter" />
                
                <!-- Quick Stats -->
                <div class="block-area">
                    <div class="row">
                        <div class="col-md-3 col-xs-6">
                            <div class="tile quick-stats">
                                    <img src="http://media.steampowered.com/steamcommunity/public/images/apps/385800/5138fe8a6fe6751c8df0b665fb92ffb3cca9cb88.jpg" alt="" style="height: 65px; width: 160px; display: inline-block; margin-left: 10px;">
                                    <h2 style="position: absolute; left: 180px; font-size: 20px; line-height: 28px; display: inline-block;">21h</h2>
                                    <h2 style="position: absolute; left: 180px;top: 45px; font-size: 20px; line-height: 28px; display: inline-block;">4321h</h2>
                                    <small>Tickets Today</small>
                            </div>
                        </div>
                        <div class="col-md-3 col-xs-6">
                            <div class="tile quick-stats">
                                    <img src="http://media.steampowered.com/steamcommunity/public/images/apps/385800/5138fe8a6fe6751c8df0b665fb92ffb3cca9cb88.jpg" alt="" style="height: 65px; width: 160px; display: inline-block; margin-left: 10px;">
                                
                                    <h2 style="position: absolute; left: 180px; font-size: 20px; line-height: 28px; display: inline-block;">21h</h2>
                                    <h2 style="position: absolute; left: 180px;top: 45px; font-size: 20px; line-height: 28px; display: inline-block;">4321h</h2>
                                    <small>Tickets Today</small>
                            </div>
                        </div>
                        <div class="col-md-3 col-xs-6">
                            <div class="tile quick-stats">
                                    <img src="http://media.steampowered.com/steamcommunity/public/images/apps/385800/5138fe8a6fe6751c8df0b665fb92ffb3cca9cb88.jpg" alt="" style="height: 65px; width: 160px; display: inline-block; margin-left: 10px;">
                                    <h2 style="position: absolute; left: 180px; font-size: 20px; line-height: 28px; display: inline-block;">21h</h2>
                                    <h2 style="position: absolute; left: 180px;top: 45px; font-size: 20px; line-height: 28px; display: inline-block;">4321h</h2>
                                    <small>Tickets Today</small>
                            </div>
                        </div>
                        <div class="col-md-3 col-xs-6">
                            <div class="tile quick-stats">
                                    <img src="http://media.steampowered.com/steamcommunity/public/images/apps/385800/5138fe8a6fe6751c8df0b665fb92ffb3cca9cb88.jpg" alt="" style="height: 65px; width: 160px; display: inline-block; margin-left: 10px;">  
                                    <h2 style="position: absolute; left: 180px; font-size: 20px; line-height: 28px; display: inline-block;">21h</h2>
                                    <h2 style="position: absolute; left: 180px;top: 45px; font-size: 20px; line-height: 28px; display: inline-block;">4321h</h2>
                                    <small>Tickets Today</small>
                            </div>
                        </div>


                    </div>

                </div>

                <hr class="whiter" />
                
                <!-- Main Widgets -->
               
                <div class="block-area">
                    <div class="row">
                        <div class="col-md-8">
                            <!-- Main Chart -->
                            <div class="tile">
                                <h2 class="tile-title">一周成就</h2>
<!--                                 <div class="tile-config dropdown">
                                    <a data-toggle="dropdown" href="" class="tile-menu"></a>
                                    <ul class="dropdown-menu pull-right text-right">
                                        <li><a class="tile-info-toggle" href="">Chart Information</a></li>
                                        <li><a href="">Refresh</a></li>
                                        <li><a href="">Settings</a></li>
                                    </ul>
                                </div> -->
                                <div class="p-10">
                                    <div id="line-chart" class="main-chart" style="height: 250px"></div>

<!--                                    <div class="chart-info">
                                        <ul class="list-unstyled">
                                            <li class="m-b-10">
                                                Total Sales 1200
                                                <span class="pull-right text-muted t-s-0">
                                                    <i class="fa fa-chevron-up"></i>
                                                    +12%
                                                </span>
                                            </li>
                                            <li>
                                                <small>
                                                    Local 640
                                                    <span class="pull-right text-muted t-s-0"><i class="fa m-l-15 fa-chevron-down"></i> -8%</span>
                                                </small>
                                                <div class="progress progress-small">
                                                    <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%"></div>
                                                </div>
                                            </li>
                                            <li>
                                                <small>
                                                    Foreign 560
                                                    <span class="pull-right text-muted t-s-0">
                                                        <i class="fa m-l-15 fa-chevron-up"></i>
                                                        -3%
                                                    </span>
                                                </small>
                                                <div class="progress progress-small">
                                                    <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 60%"></div>
                                                </div>
                                            </li>
                                        </ul>
                                    </div> -->
                                </div>  
                            </div>
    
                            <!-- Pies -->
                            <div class="tile text-center">
                                <div class="tile-dark p-10">
                                    <div class="pie-chart-tiny" data-percent="86">
                                        <span class="percent"></span>
                                        <span class="pie-title">New Visitors <i class="m-l-5 fa fa-retweet"></i></span>
                                    </div>
                                    <div class="pie-chart-tiny" data-percent="23">
                                        <span class="percent"></span>
                                        <span class="pie-title">Bounce Rate <i class="m-l-5 fa fa-retweet"></i></span>
                                    </div>
                                    <div class="pie-chart-tiny" data-percent="57">
                                        <span class="percent"></span>
                                        <span class="pie-title">Emails Sent <i class="m-l-5 fa fa-retweet"></i></span>
                                    </div>
                                    <div class="pie-chart-tiny" data-percent="34">
                                        <span class="percent"></span>
                                        <span class="pie-title">Sales Rate <i class="m-l-5 fa fa-retweet"></i></span>
                                    </div>
                                    <div class="pie-chart-tiny" data-percent="81">
                                        <span class="percent"></span>
                                        <span class="pie-title">New Signups <i class="m-l-5 fa fa-retweet"></i></span>
                                    </div>
                                </div>
                            </div>

                            <!--  Recent Postings -->
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="tile">
                                        <h2 class="tile-title">Recent Postings</h2>
                                        <div class="tile-config dropdown">
                                            <a data-toggle="dropdown" href="" class="tile-menu"></a>
                                            <ul class="dropdown-menu animated pull-right text-right">
                                                <li><a href="">Refresh</a></li>
                                                <li><a href="">Settings</a></li>
                                            </ul>
                                        </div>
                                        
                                        <div class="listview narrow">
                                            <div class="media p-l-5">
                                                <div class="pull-left">
                                                    <img width="40" src="img/profile-pics/1.jpg" alt="">
                                                </div>
                                                <div class="media-body">
                                                    <small class="text-muted">2 Hours ago by Adrien San</small><br/>
                                                    <a class="t-overflow" href="">Cras molestie fermentum nibh, ac semper</a>
                                                   
                                                </div>
                                            </div>
                                            <div class="media p-l-5">
                                                <div class="pull-left">
                                                    <img width="40" src="img/profile-pics/2.jpg" alt="">
                                                </div>
                                                <div class="media-body">
                                                    <small class="text-muted">5 Hours ago by David Villa</small><br/>
                                                    <a class="t-overflow" href="">Suspendisse in purus ut nibh placerat</a>
                                                    
                                                </div>
                                            </div>
                                            <div class="media p-l-5">
                                                <div class="pull-left">
                                                    <img width="40" src="img/profile-pics/3.jpg" alt="">
                                                </div>
                                                <div class="media-body">
                                                    <small class="text-muted">On 15/12/2013 by Mitch bradberry</small><br/>
                                                    <a class="t-overflow" href="">Cras pulvinar euismod nunc quis gravida. Suspendisse pharetra</a>
                                                    
                                                </div>
                                            </div>
                                            <div class="media p-l-5">
                                                <div class="pull-left">
                                                    <img width="40" src="img/profile-pics/4.jpg" alt="">
                                                </div>
                                                <div class="media-body">
                                                    <small class="text-muted">On 14/12/2013 by Mitch bradberry</small><br/>
                                                    <a class="t-overflow" href="">Cras pulvinar euismod nunc quis gravida. </a>
                                                    
                                                </div>
                                            </div>
                                            <div class="media p-l-5">
                                                <div class="pull-left">
                                                    <img width="40" src="img/profile-pics/5.jpg" alt="">
                                                </div>
                                                <div class="media-body">
                                                    <small class="text-muted">On 13/12/2013 by Mitch bradberry</small><br/>
                                                    <a class="t-overflow" href="">Integer a eros dapibus, vehicula quam accumsan, tincidunt purus</a>
                                                    
                                                </div>
                                            </div>
                                            <div class="media p-5 text-center l-100">
                                                <a href=""><small>VIEW ALL</small></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                
                                <!-- Tasks to do -->
                                <div class="col-md-6">
                                    <div class="tile">
                                        <h2 class="tile-title">Tasks to do</h2>
                                        <div class="tile-config dropdown">
                                            <a data-toggle="dropdown" href="" class="tile-menu"></a>
                                            <ul class="dropdown-menu pull-right text-right">
                                                <li id="todo-add"><a href="">Add New</a></li>
                                                <li id="todo-refresh"><a href="">Refresh</a></li>
                                                <li id="todo-clear"><a href="">Clear All</a></li>
                                            </ul>
                                        </div>
                                        
                                        <div class="listview todo-list sortable">
                                            <div class="media">
                                                <div class="checkbox m-0">
                                                    <label class="t-overflow">
                                                        <input type="checkbox">
                                                        Curabitur quis nisi ut nunc gravida suscipis
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="media">
                                                <div class="checkbox m-0">
                                                    <label class="t-overflow">
                                                        <input type="checkbox">
                                                        Suscipit at feugiat dewoo
                                                    </label>
                                                </div>
                                                
                                            </div>
                                            <div class="media">
                                                <div class="checkbox m-0">
                                                    <label class="t-overflow">
                                                        <input type="checkbox">
                                                        Gravida wendy lorem ipsum seen
                                                    </label>
                                                </div>
                                                
                                            </div>
                                            <div class="media">
                                                <div class="checkbox m-0">
                                                    <label class="t-overflow">
                                                        <input type="checkbox">
                                                        Fedrix quis nisi ut nunc gravida suscipit at feugiat purus
                                                    </label>
                                                </div>
                                                
                                            </div>
                                        </div>
                                        
                                        <h2 class="tile-title">Completed Tasks</h2>
                                        
                                        <div class="listview todo-list sortable">
                                            <div class="media">
                                                <div class="checkbox m-0">
                                                    <label class="t-overflow">
                                                        <input type="checkbox" checked="checked">
                                                        Motor susbect win latictals bin the woodat cool
                                                    </label>
                                                </div>
                                                
                                            </div>
                                            <div class="media">
                                                <div class="checkbox m-0">
                                                    <label class="t-overflow">
                                                        <input type="checkbox" checked="checked">
                                                        Wendy mitchel susbect win latictals bin the woodat cool
                                                    </label>
                                                </div>
                                                
                                            </div>
                                            <div class="media">
                                                <div class="checkbox m-0">
                                                    <label class="t-overflow">
                                                        <input type="checkbox" checked="checked">
                                                        Latictals bin the woodat cool for the win
                                                    </label>
                                                </div>
                                                
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="clearfix"></div>
                        </div>
                        
                        <div class="col-md-4">
                            <!-- USA Map -->
    
                            <!-- Dynamic Chart -->
                            <div class="tile">
                                <h2 class="tile-title">Server Process</h2>
                                <div class="tile-config dropdown">
                                    <a data-toggle="dropdown" href="" class="tile-menu"></a>
                                    <ul class="dropdown-menu pull-right text-right">
                                        <li><a href="">Refresh</a></li>
                                        <li><a href="">Settings</a></li>
                                    </ul>
                                </div>

                                <div class="p-t-10 p-r-5 p-b-5">
                                    <div id="dynamic-chart" style="height: 200px"></div>
                                </div>

                            </div>
                            
                            <!-- Activity -->
                            <div class="tile">
                                <h2 class="tile-title">Social Media activities</h2>
                                <div class="tile-config dropdown">
                                    <a data-toggle="dropdown" href="" class="tile-menu"></a>
                                    <ul class="dropdown-menu pull-right text-right">
                                        <li><a href="">Refresh</a></li>
                                        <li><a href="">Settings</a></li>
                                    </ul>
                                </div>
                                
                                <div class="listview narrow">
                                    
                                    <div class="media">
                                        <div class="pull-right">
                                            <div class="counts">367892</div>
                                        </div>
                                        <div class="media-body">
                                            <h6>FACEBOOK LIKES</h6>
                                        </div>
                                    </div>
                                    
                                    <div class="media">
                                        <div class="pull-right">
                                            <div class="counts">2012</div>
                                        </div>
                                        <div class="media-body">
                                            <h6>GOOGLE +1s</h6>
                                        </div>
                                    </div>
                                    
                                    <div class="media">
                                        <div class="pull-right">
                                            <div class="counts">56312</div>
                                        </div>
                                        <div class="media-body">
                                            <h6>YOUTUBE VIEWS</h6>
                                        </div>
                                    </div>
                                    
                                    <div class="media">
                                        <div class="pull-right">
                                            <div class="counts">785879</div>
                                        </div>
                                        <div class="media-body">
                                            <h6>TWITTER FOLLOWERS</h6>
                                        </div>
                                    </div>
                                    <div class="media">
                                        <div class="pull-right">
                                            <div class="counts">68</div>
                                        </div>
                                        <div class="media-body">
                                            <h6>WEBSITE COMMENTS</h6>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                </div>
                
                <!-- Chat -->
            </section>

        </section>
        
        <!-- Javascript Libraries -->
        <!-- jQuery -->
        <script src="js/jquery.min.js"></script> <!-- jQuery Library -->
        <script src="js/jquery-ui.min.js"></script> <!-- jQuery UI -->
        <script src="js/jquery.easing.1.3.js"></script> <!-- jQuery Easing - Requirred for Lightbox + Pie Charts-->

        <!-- Bootstrap -->
        <script src="js/bootstrap.min.js"></script>

        <!-- Charts -->
        <script src="js/charts/jquery.flot.js"></script> <!-- Flot Main -->
        <script src="js/charts/jquery.flot.time.js"></script> <!-- Flot sub -->
        <script src="js/charts/jquery.flot.animator.min.js"></script> <!-- Flot sub -->
        <script src="js/charts/jquery.flot.resize.min.js"></script> <!-- Flot sub - for repaint when resizing the screen -->

        <script src="js/sparkline.min.js"></script> <!-- Sparkline - Tiny charts -->
        <script src="js/easypiechart.js"></script> <!-- EasyPieChart - Animated Pie Charts -->
        <script src="js/charts.js"></script> <!-- All the above chart related functions -->

        <!-- Map -->

        <!--  Form Related -->
        <script src="js/icheck.js"></script> <!-- Custom Checkbox + Radio -->

        <!-- UX -->
        <script src="js/scroll.min.js"></script> <!-- Custom Scrollbar -->

        <!-- Other -->
        <script src="js/calendar.min.js"></script> <!-- Calendar -->
        <script src="js/feeds.min.js"></script> <!-- News Feeds -->
        

        <!-- All JS functions -->
        <script src="js/functions.js"></script>
    </body>
</html>
