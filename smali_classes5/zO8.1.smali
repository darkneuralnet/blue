.class public LzO8;
.super LnO8;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, LnO8;-><init>()V

    const-string p1, "CharMatcher.none()"

    iput-object p1, p0, LzO8;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LzO8;->a:Ljava/lang/String;

    return-object v0
.end method
