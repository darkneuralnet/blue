.class public final LdZ1$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LdZ1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:LZs5$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZs5$b<",
            "LdZ1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, LdZ1;

    const-string v1, "emptySet"

    invoke-static {v0, v1}, LZs5;->a(Ljava/lang/Class;Ljava/lang/String;)LZs5$b;

    move-result-object v0

    sput-object v0, LdZ1$c;->a:LZs5$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
