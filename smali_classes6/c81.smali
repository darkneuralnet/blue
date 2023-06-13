.class public final synthetic Lc81;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic b:Le81;


# direct methods
.method public synthetic constructor <init>(Le81;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc81;->b:Le81;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lc81;->b:Le81;

    invoke-static {v0, p1, p2}, Le81;->w(Le81;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
