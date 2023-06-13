.class public final synthetic LKF;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic b:LNF;


# direct methods
.method public synthetic constructor <init>(LNF;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKF;->b:LNF;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 1

    iget-object v0, p0, LKF;->b:LNF;

    invoke-static {v0}, LNF;->Ql(LNF;)V

    return-void
.end method
