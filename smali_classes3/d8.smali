.class public final synthetic Ld8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lg8;

.field public final synthetic c:Le8;


# direct methods
.method public synthetic constructor <init>(Lg8;Le8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld8;->b:Lg8;

    iput-object p2, p0, Ld8;->c:Le8;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Ld8;->b:Lg8;

    iget-object v1, p0, Ld8;->c:Le8;

    invoke-static {v0, v1, p1}, Le8;->o(Lg8;Le8;Landroid/view/View;)V

    return-void
.end method
