.class final enum Lcom/uber/autodispose/AutoDisposableHelper;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/disposables/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/uber/autodispose/AutoDisposableHelper;",
        ">;",
        "Lio/reactivex/disposables/c;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/uber/autodispose/AutoDisposableHelper;

.field public static final synthetic c:[Lcom/uber/autodispose/AutoDisposableHelper;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/uber/autodispose/AutoDisposableHelper;

    const-string v1, "DISPOSED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposableHelper;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/uber/autodispose/AutoDisposableHelper;->b:Lcom/uber/autodispose/AutoDisposableHelper;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/uber/autodispose/AutoDisposableHelper;

    aput-object v0, v1, v2

    sput-object v1, Lcom/uber/autodispose/AutoDisposableHelper;->c:[Lcom/uber/autodispose/AutoDisposableHelper;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static a(Ljava/util/concurrent/atomic/AtomicReference;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/disposables/c;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/disposables/c;

    sget-object v1, Lcom/uber/autodispose/AutoDisposableHelper;->b:Lcom/uber/autodispose/AutoDisposableHelper;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/disposables/c;

    if-eq p0, v1, :cond_1

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lio/reactivex/disposables/c;->dispose()V

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/uber/autodispose/AutoDisposableHelper;
    .locals 1

    const-class v0, Lcom/uber/autodispose/AutoDisposableHelper;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/uber/autodispose/AutoDisposableHelper;

    return-object p0
.end method

.method public static values()[Lcom/uber/autodispose/AutoDisposableHelper;
    .locals 1

    sget-object v0, Lcom/uber/autodispose/AutoDisposableHelper;->c:[Lcom/uber/autodispose/AutoDisposableHelper;

    invoke-virtual {v0}, [Lcom/uber/autodispose/AutoDisposableHelper;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/uber/autodispose/AutoDisposableHelper;

    return-object v0
.end method


# virtual methods
.method public dispose()V
    .locals 0

    return-void
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
