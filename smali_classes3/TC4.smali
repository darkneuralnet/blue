.class public final synthetic LTC4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic b:LWC4;


# direct methods
.method public synthetic constructor <init>(LWC4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTC4;->b:LWC4;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 1

    iget-object v0, p0, LTC4;->b:LWC4;

    invoke-static {v0}, LWC4;->Rl(LWC4;)V

    return-void
.end method
