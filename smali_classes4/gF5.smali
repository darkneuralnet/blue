.class public final LgF5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lq54;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LMc2;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LhF5;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LDX;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lq54;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "LMc2;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LhF5;",
            ">;",
            "LY94<",
            "LDX;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LgF5;->a:LY94;

    iput-object p2, p0, LgF5;->b:LY94;

    iput-object p3, p0, LgF5;->c:LY94;

    iput-object p4, p0, LgF5;->d:LY94;

    iput-object p5, p0, LgF5;->e:LY94;

    iput-object p6, p0, LgF5;->f:LY94;

    iput-object p7, p0, LgF5;->g:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LgF5;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lq54;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "LMc2;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LhF5;",
            ">;",
            "LY94<",
            "LDX;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)",
            "LgF5;"
        }
    .end annotation

    new-instance v8, LgF5;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LgF5;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static c(Lq54;LYR4;LMc2;LTq4;LhF5;LDX;Le13;)Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;
    .locals 9

    new-instance v8, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;-><init>(Lq54;LYR4;LMc2;LTq4;LhF5;LDX;Le13;)V

    return-object v8
.end method


# virtual methods
.method public b()Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;
    .locals 8

    iget-object v0, p0, LgF5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lq54;

    iget-object v0, p0, LgF5;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LYR4;

    iget-object v0, p0, LgF5;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LMc2;

    iget-object v0, p0, LgF5;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LTq4;

    iget-object v0, p0, LgF5;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LhF5;

    iget-object v0, p0, LgF5;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LDX;

    iget-object v0, p0, LgF5;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Le13;

    invoke-static/range {v1 .. v7}, LgF5;->c(Lq54;LYR4;LMc2;LTq4;LhF5;LDX;Le13;)Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LgF5;->b()Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    move-result-object v0

    return-object v0
.end method
