.class public final synthetic Lpr1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ltr1;

.field public final synthetic c:Lco/bird/android/core/mvp/BaseActivity;


# direct methods
.method public synthetic constructor <init>(Ltr1;Lco/bird/android/core/mvp/BaseActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpr1;->b:Ltr1;

    iput-object p2, p0, Lpr1;->c:Lco/bird/android/core/mvp/BaseActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lpr1;->b:Ltr1;

    iget-object v1, p0, Lpr1;->c:Lco/bird/android/core/mvp/BaseActivity;

    invoke-static {v0, v1}, Ltr1;->Rl(Ltr1;Lco/bird/android/core/mvp/BaseActivity;)V

    return-void
.end method
