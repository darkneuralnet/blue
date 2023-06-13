.class public final synthetic LBM1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Lco/bird/android/model/persistence/Bird;

.field public final synthetic c:LvM1;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/model/persistence/Bird;LvM1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBM1;->b:Lco/bird/android/model/persistence/Bird;

    iput-object p2, p0, LBM1;->c:LvM1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LBM1;->b:Lco/bird/android/model/persistence/Bird;

    iget-object v1, p0, LBM1;->c:LvM1;

    invoke-static {v0, v1}, LvM1$l;->b(Lco/bird/android/model/persistence/Bird;LvM1;)V

    return-void
.end method
