.class public final synthetic LV7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic b:LY7;


# direct methods
.method public synthetic constructor <init>(LY7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV7;->b:LY7;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 1

    iget-object v0, p0, LV7;->b:LY7;

    invoke-static {v0}, LY7;->Pl(LY7;)V

    return-void
.end method
