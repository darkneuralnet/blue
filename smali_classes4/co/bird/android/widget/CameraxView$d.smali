.class public final Lco/bird/android/widget/CameraxView$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/widget/CameraxView$a$a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/widget/CameraxView;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "co/bird/android/widget/CameraxView$d",
        "Lco/bird/android/widget/CameraxView$a$a$a;",
        "",
        "granted",
        "",
        "a",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Landroidx/appcompat/app/AppCompatActivity;

.field public final synthetic b:Lco/bird/android/widget/CameraxView$a$a;

.field public final synthetic c:Lco/bird/android/widget/CameraxView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/AppCompatActivity;Lco/bird/android/widget/CameraxView$a$a;Lco/bird/android/widget/CameraxView;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/CameraxView$d;->a:Landroidx/appcompat/app/AppCompatActivity;

    iput-object p2, p0, Lco/bird/android/widget/CameraxView$d;->b:Lco/bird/android/widget/CameraxView$a$a;

    iput-object p3, p0, Lco/bird/android/widget/CameraxView$d;->c:Lco/bird/android/widget/CameraxView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/CameraxView$d;->a:Landroidx/appcompat/app/AppCompatActivity;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->q()Landroidx/fragment/app/m;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/widget/CameraxView$d;->b:Lco/bird/android/widget/CameraxView$a$a;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/m;->s(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/m;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/m;->j()I

    if-eqz p1, :cond_0

    iget-object p1, p0, Lco/bird/android/widget/CameraxView$d;->c:Lco/bird/android/widget/CameraxView;

    invoke-static {p1}, Lco/bird/android/widget/CameraxView;->access$requestRebind(Lco/bird/android/widget/CameraxView;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "camera permission not granted in CameraxView, the user was prompted"

    invoke-static {v0, p1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
