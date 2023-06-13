.class public final LJk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lbq3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhj;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/persistence/operatororderview/OperatorOrderViewDatabase;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhj;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Lco/bird/android/persistence/operatororderview/OperatorOrderViewDatabase;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJk;->a:Lhj;

    iput-object p2, p0, LJk;->b:LY94;

    return-void
.end method

.method public static a(Lhj;LY94;)LJk;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Lco/bird/android/persistence/operatororderview/OperatorOrderViewDatabase;",
            ">;)",
            "LJk;"
        }
    .end annotation

    new-instance v0, LJk;

    invoke-direct {v0, p0, p1}, LJk;-><init>(Lhj;LY94;)V

    return-object v0
.end method

.method public static c(Lhj;Lco/bird/android/persistence/operatororderview/OperatorOrderViewDatabase;)Lbq3;
    .locals 0

    invoke-virtual {p0, p1}, Lhj;->C0(Lco/bird/android/persistence/operatororderview/OperatorOrderViewDatabase;)Lbq3;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbq3;

    return-object p0
.end method


# virtual methods
.method public b()Lbq3;
    .locals 2

    iget-object v0, p0, LJk;->a:Lhj;

    iget-object v1, p0, LJk;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/persistence/operatororderview/OperatorOrderViewDatabase;

    invoke-static {v0, v1}, LJk;->c(Lhj;Lco/bird/android/persistence/operatororderview/OperatorOrderViewDatabase;)Lbq3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJk;->b()Lbq3;

    move-result-object v0

    return-object v0
.end method
