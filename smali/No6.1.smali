.class public final synthetic LNo6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:LUo6;

.field public final synthetic b:Landroidx/camera/core/impl/q$b;


# direct methods
.method public synthetic constructor <init>(LUo6;Landroidx/camera/core/impl/q$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNo6;->a:LUo6;

    iput-object p2, p0, LNo6;->b:Landroidx/camera/core/impl/q$b;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LNo6;->a:LUo6;

    iget-object v1, p0, LNo6;->b:Landroidx/camera/core/impl/q$b;

    invoke-static {v0, v1, p1}, LUo6;->W(LUo6;Landroidx/camera/core/impl/q$b;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
