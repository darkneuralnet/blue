.class public LgQ5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static d:Ljava/lang/String; = "1.7"

.field public static e:LgQ5;

.field public static f:Ljava/lang/Object;


# instance fields
.field public a:Z

.field public b:Lch/qos/logback/classic/LoggerContext;

.field public final c:Lch/qos/logback/classic/util/ContextSelectorStaticBinder;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LgQ5;

    invoke-direct {v0}, LgQ5;-><init>()V

    sput-object v0, LgQ5;->e:LgQ5;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sput-object v1, LgQ5;->f:Ljava/lang/Object;

    invoke-virtual {v0}, LgQ5;->d()V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LgQ5;->a:Z

    new-instance v0, Lch/qos/logback/classic/LoggerContext;

    invoke-direct {v0}, Lch/qos/logback/classic/LoggerContext;-><init>()V

    iput-object v0, p0, LgQ5;->b:Lch/qos/logback/classic/LoggerContext;

    invoke-static {}, Lch/qos/logback/classic/util/ContextSelectorStaticBinder;->getSingleton()Lch/qos/logback/classic/util/ContextSelectorStaticBinder;

    move-result-object v0

    iput-object v0, p0, LgQ5;->c:Lch/qos/logback/classic/util/ContextSelectorStaticBinder;

    iget-object v0, p0, LgQ5;->b:Lch/qos/logback/classic/LoggerContext;

    const-string v1, "default"

    invoke-virtual {v0, v1}, Lch/qos/logback/classic/LoggerContext;->setName(Ljava/lang/String;)V

    return-void
.end method

.method public static c()LgQ5;
    .locals 1

    sget-object v0, LgQ5;->e:LgQ5;

    return-object v0
.end method


# virtual methods
.method public a()LPO1;
    .locals 2

    iget-boolean v0, p0, LgQ5;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LgQ5;->b:Lch/qos/logback/classic/LoggerContext;

    return-object v0

    :cond_0
    iget-object v0, p0, LgQ5;->c:Lch/qos/logback/classic/util/ContextSelectorStaticBinder;

    invoke-virtual {v0}, Lch/qos/logback/classic/util/ContextSelectorStaticBinder;->getContextSelector()Lch/qos/logback/classic/selector/ContextSelector;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LgQ5;->c:Lch/qos/logback/classic/util/ContextSelectorStaticBinder;

    invoke-virtual {v0}, Lch/qos/logback/classic/util/ContextSelectorStaticBinder;->getContextSelector()Lch/qos/logback/classic/selector/ContextSelector;

    move-result-object v0

    invoke-interface {v0}, Lch/qos/logback/classic/selector/ContextSelector;->getLoggerContext()Lch/qos/logback/classic/LoggerContext;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "contextSelector cannot be null. See also http://logback.qos.ch/codes.html#null_CS"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LgQ5;->c:Lch/qos/logback/classic/util/ContextSelectorStaticBinder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()V
    .locals 3

    :try_start_0
    new-instance v0, Lch/qos/logback/classic/util/ContextInitializer;

    iget-object v1, p0, LgQ5;->b:Lch/qos/logback/classic/LoggerContext;

    invoke-direct {v0, v1}, Lch/qos/logback/classic/util/ContextInitializer;-><init>(Lch/qos/logback/classic/LoggerContext;)V

    invoke-virtual {v0}, Lch/qos/logback/classic/util/ContextInitializer;->autoConfig()V
    :try_end_0
    .catch Lch/qos/logback/core/joran/spi/JoranException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    :try_start_1
    const-string v1, "Failed to auto configure default logger context"

    invoke-static {v1, v0}, Lui6;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    iget-object v0, p0, LgQ5;->b:Lch/qos/logback/classic/LoggerContext;

    invoke-static {v0}, Lch/qos/logback/core/status/StatusUtil;->contextHasStatusListener(Lch/qos/logback/core/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LgQ5;->b:Lch/qos/logback/classic/LoggerContext;

    invoke-static {v0}, Lch/qos/logback/core/util/StatusPrinter;->printInCaseOfErrorsOrWarnings(Lch/qos/logback/core/Context;)V

    :cond_0
    iget-object v0, p0, LgQ5;->c:Lch/qos/logback/classic/util/ContextSelectorStaticBinder;

    iget-object v1, p0, LgQ5;->b:Lch/qos/logback/classic/LoggerContext;

    sget-object v2, LgQ5;->f:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lch/qos/logback/classic/util/ContextSelectorStaticBinder;->init(Lch/qos/logback/classic/LoggerContext;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LgQ5;->a:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to instantiate ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v2, Lch/qos/logback/classic/LoggerContext;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lui6;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
