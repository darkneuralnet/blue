.class public final synthetic LTl1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIZ3;


# instance fields
.field public final synthetic b:LIZ3;


# direct methods
.method public synthetic constructor <init>(LIZ3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTl1;->b:LIZ3;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LTl1;->b:LIZ3;

    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {v0, p1}, LSl1$b$a;->b(LIZ3;Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method
