.class public final synthetic LN56;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/util/concurrent/ScheduledExecutorService;

.field public final synthetic d:Lcom/google/firebase/messaging/FirebaseMessaging;

.field public final synthetic e:LET2;

.field public final synthetic f:LZC1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/firebase/messaging/FirebaseMessaging;LET2;LZC1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN56;->b:Landroid/content/Context;

    iput-object p2, p0, LN56;->c:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, LN56;->d:Lcom/google/firebase/messaging/FirebaseMessaging;

    iput-object p4, p0, LN56;->e:LET2;

    iput-object p5, p0, LN56;->f:LZC1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, LN56;->b:Landroid/content/Context;

    iget-object v1, p0, LN56;->c:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v2, p0, LN56;->d:Lcom/google/firebase/messaging/FirebaseMessaging;

    iget-object v3, p0, LN56;->e:LET2;

    iget-object v4, p0, LN56;->f:LZC1;

    invoke-static {v0, v1, v2, v3, v4}, LO56;->a(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/firebase/messaging/FirebaseMessaging;LET2;LZC1;)LO56;

    move-result-object v0

    return-object v0
.end method
