.class public final synthetic LU64;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LxA1;


# instance fields
.field public final synthetic a:LX64;


# direct methods
.method public synthetic constructor <init>(LX64;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU64;->a:LX64;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LU64;->a:LX64;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p1}, LX64;->m(LX64;Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
