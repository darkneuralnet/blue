.class public final synthetic Lfj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/appcompat/app/d$a;

.field public final synthetic c:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/app/d$a;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfj;->b:Landroidx/appcompat/app/d$a;

    iput-object p2, p0, Lfj;->c:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lfj;->b:Landroidx/appcompat/app/d$a;

    iget-object v1, p0, Lfj;->c:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Landroidx/appcompat/app/d$a;->a(Landroidx/appcompat/app/d$a;Ljava/lang/Runnable;)V

    return-void
.end method
