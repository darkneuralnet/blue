.class public Lzendesk/belvedere/h$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/belvedere/h;->r(Lzendesk/belvedere/FloatingActionMenu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lzendesk/belvedere/h;


# direct methods
.method public constructor <init>(Lzendesk/belvedere/h;)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/h$d;->b:Lzendesk/belvedere/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lzendesk/belvedere/h$d;->b:Lzendesk/belvedere/h;

    invoke-static {p1}, Lzendesk/belvedere/h;->m(Lzendesk/belvedere/h;)Lzendesk/belvedere/g;

    move-result-object p1

    invoke-virtual {p1}, Lzendesk/belvedere/g;->j()V

    iget-object p1, p0, Lzendesk/belvedere/h$d;->b:Lzendesk/belvedere/h;

    invoke-virtual {p1}, Lzendesk/belvedere/h;->dismiss()V

    return-void
.end method
