.class public LYP2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYP2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Landroidx/lifecycle/f;

.field public b:Landroidx/lifecycle/i;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/f;Landroidx/lifecycle/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYP2$a;->a:Landroidx/lifecycle/f;

    iput-object p2, p0, LYP2$a;->b:Landroidx/lifecycle/i;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/f;->a(LFq2;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, LYP2$a;->a:Landroidx/lifecycle/f;

    iget-object v1, p0, LYP2$a;->b:Landroidx/lifecycle/i;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/f;->d(LFq2;)V

    const/4 v0, 0x0

    iput-object v0, p0, LYP2$a;->b:Landroidx/lifecycle/i;

    return-void
.end method
