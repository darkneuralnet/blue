.class public final LHk2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LHk2;

.field public static final c:LHk2;

.field public static final d:LHk2;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LHk2;

    const-string v1, "ENABLED"

    invoke-direct {v0, v1}, LHk2;-><init>(Ljava/lang/String;)V

    sput-object v0, LHk2;->b:LHk2;

    new-instance v0, LHk2;

    const-string v1, "DISABLED"

    invoke-direct {v0, v1}, LHk2;-><init>(Ljava/lang/String;)V

    sput-object v0, LHk2;->c:LHk2;

    new-instance v0, LHk2;

    const-string v1, "DESTROYED"

    invoke-direct {v0, v1}, LHk2;-><init>(Ljava/lang/String;)V

    sput-object v0, LHk2;->d:LHk2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHk2;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LHk2;->a:Ljava/lang/String;

    return-object v0
.end method
