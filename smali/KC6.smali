.class public final synthetic LKC6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LnV5$c;


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKC6;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(LnV5$b;)LnV5;
    .locals 1

    iget-object v0, p0, LKC6;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Landroidx/work/impl/WorkDatabase$a;->a(Landroid/content/Context;LnV5$b;)LnV5;

    move-result-object p1

    return-object p1
.end method
