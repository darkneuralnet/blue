.class public final synthetic LFK6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDK6;


# static fields
.field public static final b:LDK6;

.field public static final c:LDK6;


# instance fields
.field public final synthetic a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LFK6;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LFK6;-><init>([B)V

    sput-object v0, LFK6;->c:LDK6;

    new-instance v0, LFK6;

    invoke-direct {v0}, LFK6;-><init>()V

    sput-object v0, LFK6;->b:LDK6;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LFK6;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, LFK6;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;)I
    .locals 0

    return p1
.end method
