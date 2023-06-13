.class public final LKk9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLD8;


# static fields
.field public static final c:LKk9;


# instance fields
.field public final b:LLD8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LKk9;

    invoke-direct {v0}, LKk9;-><init>()V

    sput-object v0, LKk9;->c:LKk9;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, LWk9;

    invoke-direct {v0}, LWk9;-><init>()V

    invoke-static {v0}, LRE8;->b(Ljava/lang/Object;)LLD8;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, LRE8;->a(LLD8;)LLD8;

    move-result-object v0

    iput-object v0, p0, LKk9;->b:LLD8;

    return-void
.end method

.method public static b()Z
    .locals 1

    sget-object v0, LKk9;->c:LKk9;

    invoke-virtual {v0}, LKk9;->a()LQk9;

    move-result-object v0

    invoke-interface {v0}, LQk9;->zza()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final a()LQk9;
    .locals 1

    iget-object v0, p0, LKk9;->b:LLD8;

    invoke-interface {v0}, LLD8;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQk9;

    return-object v0
.end method

.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LKk9;->a()LQk9;

    move-result-object v0

    return-object v0
.end method
