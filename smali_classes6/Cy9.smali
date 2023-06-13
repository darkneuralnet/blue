.class public final LCy9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCx9;


# static fields
.field public static final b:LCy9;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LCy9;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LCy9;-><init>(Ljava/lang/Object;)V

    sput-object v0, LCy9;->b:LCy9;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCy9;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a(Ljava/lang/Object;)LCx9;
    .locals 1

    new-instance v0, LCy9;

    invoke-direct {v0, p0}, LCy9;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LCy9;->a:Ljava/lang/Object;

    return-object v0
.end method
