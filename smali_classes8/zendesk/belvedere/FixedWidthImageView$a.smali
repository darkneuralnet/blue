.class public Lzendesk/belvedere/FixedWidthImageView$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/belvedere/FixedWidthImageView;->c(LiT3;IILandroid/net/Uri;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lzendesk/belvedere/FixedWidthImageView;


# direct methods
.method public constructor <init>(Lzendesk/belvedere/FixedWidthImageView;)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/FixedWidthImageView$a;->b:Lzendesk/belvedere/FixedWidthImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lzendesk/belvedere/FixedWidthImageView$a;->b:Lzendesk/belvedere/FixedWidthImageView;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    return-void
.end method
