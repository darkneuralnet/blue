.class public LI56$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI56;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LI56;


# direct methods
.method public constructor <init>(LI56;)V
    .locals 0

    iput-object p1, p0, LI56$a;->b:LI56;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    iget-object p2, p0, LI56$a;->b:LI56;

    invoke-static {p2, p1}, LI56;->p0(LI56;Landroid/view/View;)V

    return-void
.end method
