.class public final synthetic LmW5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic b:LnW5;


# direct methods
.method public synthetic constructor <init>(LnW5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LmW5;->b:LnW5;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LmW5;->b:LnW5;

    check-cast p1, Landroidx/camera/core/impl/q$e;

    check-cast p2, Landroidx/camera/core/impl/q$e;

    invoke-static {v0, p1, p2}, LnW5;->a(LnW5;Landroidx/camera/core/impl/q$e;Landroidx/camera/core/impl/q$e;)I

    move-result p1

    return p1
.end method
