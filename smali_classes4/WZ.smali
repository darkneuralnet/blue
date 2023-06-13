.class public final synthetic LWZ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroid/view/ViewGroup;

.field public final synthetic c:Landroid/widget/LinearLayout;

.field public final synthetic d:Lco/bird/android/widget/e;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;Landroid/widget/LinearLayout;Lco/bird/android/widget/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWZ;->b:Landroid/view/ViewGroup;

    iput-object p2, p0, LWZ;->c:Landroid/widget/LinearLayout;

    iput-object p3, p0, LWZ;->d:Lco/bird/android/widget/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LWZ;->b:Landroid/view/ViewGroup;

    iget-object v1, p0, LWZ;->c:Landroid/widget/LinearLayout;

    iget-object v2, p0, LWZ;->d:Lco/bird/android/widget/e;

    invoke-static {v0, v1, v2}, Lco/bird/android/widget/e;->a5(Landroid/view/ViewGroup;Landroid/widget/LinearLayout;Lco/bird/android/widget/e;)V

    return-void
.end method
