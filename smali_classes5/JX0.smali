.class public final synthetic LJX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:LMX0;


# direct methods
.method public synthetic constructor <init>(LMX0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJX0;->b:LMX0;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LJX0;->b:LMX0;

    invoke-static {v0, p1}, LMX0;->h(LMX0;Landroid/view/View;)V

    return-void
.end method