.class public final synthetic LZ64;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrz0;


# instance fields
.field public final synthetic a:Le74;


# direct methods
.method public synthetic constructor <init>(Le74;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ64;->a:Le74;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LZ64;->a:Le74;

    check-cast p1, Le74$b;

    invoke-static {v0, p1}, Le74;->b(Le74;Le74$b;)V

    return-void
.end method
