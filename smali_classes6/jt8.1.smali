.class public final Ljt8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll68;

.field public static volatile b:Ll68;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lim8;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lim8;-><init>(Lpe8;)V

    sput-object v0, Ljt8;->a:Ll68;

    sput-object v0, Ljt8;->b:Ll68;

    return-void
.end method

.method public static a()Ll68;
    .locals 1

    sget-object v0, Ljt8;->b:Ll68;

    return-object v0
.end method
