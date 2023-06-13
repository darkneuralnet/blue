.class public final synthetic Lim5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic b:Lkm5;


# direct methods
.method public synthetic constructor <init>(Lkm5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lim5;->b:Lkm5;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 1

    iget-object v0, p0, Lim5;->b:Lkm5;

    invoke-static {v0}, Lkm5;->Pl(Lkm5;)V

    return-void
.end method
