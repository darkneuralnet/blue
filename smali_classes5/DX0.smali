.class public final synthetic LDX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:LEX0;


# direct methods
.method public synthetic constructor <init>(LEX0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDX0;->b:LEX0;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LDX0;->b:LEX0;

    invoke-static {v0, p1}, LEX0;->b(LEX0;Landroid/view/View;)V

    return-void
.end method
