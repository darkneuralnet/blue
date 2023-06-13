.class public LDu0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDu0;-><init>(LGu0;LEu0;Landroid/view/ViewGroup;Lcom/github/jinatonic/confetti/ConfettiView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LDu0;


# direct methods
.method public constructor <init>(LDu0;)V
    .locals 0

    iput-object p1, p0, LDu0$a;->b:LDu0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, LDu0$a;->b:LDu0;

    invoke-virtual {p1}, LDu0;->y()V

    return-void
.end method
