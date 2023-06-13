.class public final synthetic LDw3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic b:LPw3;


# direct methods
.method public synthetic constructor <init>(LPw3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDw3;->b:LPw3;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 1

    iget-object v0, p0, LDw3;->b:LPw3;

    invoke-static {v0}, LPw3;->Vl(LPw3;)V

    return-void
.end method
