.class public final synthetic LJx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCanceledListener;


# instance fields
.field public final synthetic a:Landroid/media/Image;


# direct methods
.method public synthetic constructor <init>(Landroid/media/Image;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJx;->a:Landroid/media/Image;

    return-void
.end method


# virtual methods
.method public final onCanceled()V
    .locals 1

    iget-object v0, p0, LJx;->a:Landroid/media/Image;

    invoke-static {v0}, LPx;->k(Landroid/media/Image;)V

    return-void
.end method
