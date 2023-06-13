.class public final Lol1;
.super LwE;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lol1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0011\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008 \u0010!J4\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u001f\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006$"
    }
    d2 = {
        "Lol1;",
        "LwE;",
        "",
        "priority",
        "",
        "tag",
        "message",
        "",
        "t",
        "LnO5;",
        "stackData",
        "",
        "D",
        "Lcom/michaelflisar/lumberjack/FileLoggingSetup;",
        "setup",
        "H",
        "logMessage",
        "thread",
        "G",
        "Landroid/os/HandlerThread;",
        "e",
        "Landroid/os/HandlerThread;",
        "mHandlerThread",
        "Landroid/os/Handler;",
        "f",
        "Landroid/os/Handler;",
        "mBackgroundHandler",
        "LgM2;",
        "kotlin.jvm.PlatformType",
        "g",
        "LgM2;",
        "WTF_MARKER",
        "<init>",
        "(Lcom/michaelflisar/lumberjack/FileLoggingSetup;)V",
        "h",
        "a",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final h:Lol1$a;

.field public static final i:I

.field public static j:Lzx2;


# instance fields
.field public e:Landroid/os/HandlerThread;

.field public f:Landroid/os/Handler;

.field public final g:LgM2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lol1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lol1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lol1;->h:Lol1$a;

    const/16 v0, 0x8

    sput v0, Lol1;->i:I

    const-class v0, Lol1;

    invoke-static {v0}, LKx2;->i(Ljava/lang/Class;)Lzx2;

    move-result-object v0

    sput-object v0, Lol1;->j:Lzx2;

    return-void
.end method

.method public constructor <init>(Lcom/michaelflisar/lumberjack/FileLoggingSetup;)V
    .locals 3

    invoke-direct {p0}, LwE;-><init>()V

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/michaelflisar/lumberjack/FileLoggingSetup;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "FileLoggingTree"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lol1;->f:Landroid/os/Handler;

    iput-object v0, p0, Lol1;->e:Landroid/os/HandlerThread;

    :cond_0
    invoke-virtual {p0, p1}, Lol1;->H(Lcom/michaelflisar/lumberjack/FileLoggingSetup;)V

    const-string p1, "WTF-"

    invoke-static {p1}, LjM2;->b(Ljava/lang/String;)LgM2;

    move-result-object p1

    iput-object p1, p0, Lol1;->g:LgM2;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "You can\'t create a FileLoggingTree without providing a setup!"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic E(Lol1;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lol1;->J(Lol1;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final J(Lol1;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$logMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$thread"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3}, Lol1;->G(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getMLogger$cp()Lzx2;
    .locals 1

    sget-object v0, Lol1;->j:Lzx2;

    return-object v0
.end method

.method public static final synthetic access$setMLogger$cp(Lzx2;)V
    .locals 0

    sput-object p0, Lol1;->j:Lzx2;

    return-void
.end method


# virtual methods
.method public D(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;LnO5;)V
    .locals 0

    const-string p4, "message"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "stackData"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p3}, LwE;->A(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Thread;->toString()Ljava/lang/String;

    move-result-object p3

    const-string p4, "currentThread().toString()"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p4, p0, Lol1;->f:Landroid/os/Handler;

    if-eqz p4, :cond_0

    new-instance p5, Lnl1;

    invoke-direct {p5, p0, p1, p2, p3}, Lnl1;-><init>(Lol1;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p4, p5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lol1;->G(ILjava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final G(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x3

    if-ge p1, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    sget-object p1, Lol1;->j:Lzx2;

    iget-object p3, p0, Lol1;->g:LgM2;

    invoke-interface {p1, p3, p2}, Lzx2;->error(LgM2;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_1
    sget-object p1, Lol1;->j:Lzx2;

    invoke-interface {p1, p2}, Lzx2;->error(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_2
    sget-object p1, Lol1;->j:Lzx2;

    invoke-interface {p1, p2}, Lzx2;->warn(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_3
    sget-object p1, Lol1;->j:Lzx2;

    invoke-interface {p1, p2}, Lzx2;->info(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_4
    sget-object p1, Lol1;->j:Lzx2;

    invoke-interface {p1, p2}, Lzx2;->debug(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_5
    sget-object p1, Lol1;->j:Lzx2;

    invoke-interface {p1, p2}, Lzx2;->trace(Ljava/lang/String;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final H(Lcom/michaelflisar/lumberjack/FileLoggingSetup;)V
    .locals 10

    invoke-static {}, LKx2;->h()LPO1;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type ch.qos.logback.classic.LoggerContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lch/qos/logback/classic/LoggerContext;

    invoke-virtual {v0}, Lch/qos/logback/classic/LoggerContext;->reset()V

    new-instance v1, Lch/qos/logback/classic/encoder/PatternLayoutEncoder;

    invoke-direct {v1}, Lch/qos/logback/classic/encoder/PatternLayoutEncoder;-><init>()V

    invoke-virtual {v1, v0}, Lch/qos/logback/core/spi/ContextAwareBase;->setContext(Lch/qos/logback/core/Context;)V

    invoke-virtual {p1}, Lcom/michaelflisar/lumberjack/FileLoggingSetup;->c()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    move-result-object v2

    invoke-virtual {v2}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lch/qos/logback/core/pattern/PatternLayoutEncoderBase;->setPattern(Ljava/lang/String;)V

    invoke-virtual {v1}, Lch/qos/logback/classic/encoder/PatternLayoutEncoder;->start()V

    new-instance v2, Lch/qos/logback/core/rolling/RollingFileAppender;

    invoke-direct {v2}, Lch/qos/logback/core/rolling/RollingFileAppender;-><init>()V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lch/qos/logback/core/FileAppender;->setAppend(Z)V

    invoke-virtual {v2, v0}, Lch/qos/logback/core/spi/ContextAwareBase;->setContext(Lch/qos/logback/core/Context;)V

    instance-of v4, p1, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;

    const-string v5, "/"

    if-eqz v4, :cond_0

    new-instance v4, Lch/qos/logback/core/rolling/TimeBasedRollingPolicy;

    invoke-direct {v4}, Lch/qos/logback/core/rolling/TimeBasedRollingPolicy;-><init>()V

    invoke-virtual {p1}, Lcom/michaelflisar/lumberjack/FileLoggingSetup;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/michaelflisar/lumberjack/FileLoggingSetup;->c()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    move-result-object v7

    invoke-virtual {v7}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/michaelflisar/lumberjack/FileLoggingSetup;->c()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    move-result-object v8

    invoke-virtual {v8}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;->a()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "_%d{yyyyMMdd}."

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lch/qos/logback/core/rolling/RollingPolicyBase;->setFileNamePattern(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/michaelflisar/lumberjack/FileLoggingSetup;->c()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    move-result-object p1

    invoke-virtual {p1}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;->d()I

    move-result p1

    invoke-virtual {v4, p1}, Lch/qos/logback/core/rolling/TimeBasedRollingPolicy;->setMaxHistory(I)V

    invoke-virtual {v4, v3}, Lch/qos/logback/core/rolling/TimeBasedRollingPolicy;->setCleanHistoryOnStart(Z)V

    invoke-virtual {v4, v2}, Lch/qos/logback/core/rolling/RollingPolicyBase;->setParent(Lch/qos/logback/core/FileAppender;)V

    invoke-virtual {v4, v0}, Lch/qos/logback/core/spi/ContextAwareBase;->setContext(Lch/qos/logback/core/Context;)V

    goto :goto_0

    :cond_0
    instance-of v4, p1, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;

    if-eqz v4, :cond_1

    new-instance v4, Lch/qos/logback/core/rolling/FixedWindowRollingPolicy;

    invoke-direct {v4}, Lch/qos/logback/core/rolling/FixedWindowRollingPolicy;-><init>()V

    invoke-virtual {p1}, Lcom/michaelflisar/lumberjack/FileLoggingSetup;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/michaelflisar/lumberjack/FileLoggingSetup;->c()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    move-result-object v7

    invoke-virtual {v7}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/michaelflisar/lumberjack/FileLoggingSetup;->c()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    move-result-object v8

    invoke-virtual {v8}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;->a()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "%i."

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lch/qos/logback/core/rolling/RollingPolicyBase;->setFileNamePattern(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Lch/qos/logback/core/rolling/FixedWindowRollingPolicy;->setMinIndex(I)V

    invoke-virtual {p1}, Lcom/michaelflisar/lumberjack/FileLoggingSetup;->c()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    move-result-object v3

    invoke-virtual {v3}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;->d()I

    move-result v3

    invoke-virtual {v4, v3}, Lch/qos/logback/core/rolling/FixedWindowRollingPolicy;->setMaxIndex(I)V

    invoke-virtual {v4, v2}, Lch/qos/logback/core/rolling/RollingPolicyBase;->setParent(Lch/qos/logback/core/FileAppender;)V

    invoke-virtual {v4, v0}, Lch/qos/logback/core/spi/ContextAwareBase;->setContext(Lch/qos/logback/core/Context;)V

    new-instance v0, Lch/qos/logback/core/rolling/SizeBasedTriggeringPolicy;

    invoke-direct {v0}, Lch/qos/logback/core/rolling/SizeBasedTriggeringPolicy;-><init>()V

    check-cast p1, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;

    invoke-virtual {p1}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lch/qos/logback/core/util/FileSize;->valueOf(Ljava/lang/String;)Lch/qos/logback/core/util/FileSize;

    move-result-object v3

    invoke-virtual {v0, v3}, Lch/qos/logback/core/rolling/SizeBasedTriggeringPolicy;->setMaxFileSize(Lch/qos/logback/core/util/FileSize;)V

    invoke-virtual {p1}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lch/qos/logback/core/rolling/RollingFileAppender;->setFile(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Lch/qos/logback/core/rolling/RollingFileAppender;->setRollingPolicy(Lch/qos/logback/core/rolling/RollingPolicy;)V

    invoke-virtual {v4}, Lch/qos/logback/core/rolling/FixedWindowRollingPolicy;->start()V

    move-object v4, v0

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    invoke-interface {v4}, Lch/qos/logback/core/spi/LifeCycle;->start()V

    invoke-virtual {v2, v4}, Lch/qos/logback/core/rolling/RollingFileAppender;->setTriggeringPolicy(Lch/qos/logback/core/rolling/TriggeringPolicy;)V

    invoke-virtual {v2, v1}, Lch/qos/logback/core/OutputStreamAppender;->setEncoder(Lch/qos/logback/core/encoder/Encoder;)V

    invoke-virtual {v2}, Lch/qos/logback/core/rolling/RollingFileAppender;->start()V

    sget-object p1, Lol1;->j:Lzx2;

    const-string v0, "null cannot be cast to non-null type ch.qos.logback.classic.Logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lch/qos/logback/classic/Logger;

    invoke-virtual {p1}, Lch/qos/logback/classic/Logger;->detachAndStopAllAppenders()V

    invoke-virtual {p1, v2}, Lch/qos/logback/classic/Logger;->addAppender(Lch/qos/logback/core/Appender;)V

    sget-object v0, Lch/qos/logback/classic/Level;->ALL:Lch/qos/logback/classic/Level;

    invoke-virtual {p1, v0}, Lch/qos/logback/classic/Logger;->setLevel(Lch/qos/logback/classic/Level;)V

    return-void
.end method
