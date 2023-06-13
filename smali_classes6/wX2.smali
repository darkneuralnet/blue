.class public final LwX2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LwX2$b;
    }
.end annotation


# static fields
.field public static final b:LwX2;

.field public static final c:LwX2$b;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "LyV2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LwX2;

    invoke-direct {v0}, LwX2;-><init>()V

    sput-object v0, LwX2;->b:LwX2;

    new-instance v0, LwX2$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LwX2$b;-><init>(LwX2$a;)V

    sput-object v0, LwX2;->c:LwX2$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, LwX2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static b()LwX2;
    .locals 1

    sget-object v0, LwX2;->b:LwX2;

    return-object v0
.end method


# virtual methods
.method public a()LyV2;
    .locals 1

    iget-object v0, p0, LwX2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LyV2;

    if-nez v0, :cond_0

    sget-object v0, LwX2;->c:LwX2$b;

    :cond_0
    return-object v0
.end method
