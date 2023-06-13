.class public final Lfz1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LV74;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LV74;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfz1;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Lfz1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LV74;",
            ">;)",
            "Lfz1;"
        }
    .end annotation

    new-instance v0, Lfz1;

    invoke-direct {v0, p0}, Lfz1;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LV74;LH31;Lco/bird/android/core/mvp/BaseActivity;)Lcz1;
    .locals 1

    new-instance v0, Lcz1;

    invoke-direct {v0, p0, p1, p2}, Lcz1;-><init>(LV74;LH31;Lco/bird/android/core/mvp/BaseActivity;)V

    return-object v0
.end method


# virtual methods
.method public b(LH31;Lco/bird/android/core/mvp/BaseActivity;)Lcz1;
    .locals 1

    iget-object v0, p0, Lfz1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LV74;

    invoke-static {v0, p1, p2}, Lfz1;->c(LV74;LH31;Lco/bird/android/core/mvp/BaseActivity;)Lcz1;

    move-result-object p1

    return-object p1
.end method
