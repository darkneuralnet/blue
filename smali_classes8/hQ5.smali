.class public LhQ5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LhQ5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LhQ5;

    invoke-direct {v0}, LhQ5;-><init>()V

    sput-object v0, LhQ5;->a:LhQ5;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final b()LhQ5;
    .locals 1

    sget-object v0, LhQ5;->a:LhQ5;

    return-object v0
.end method


# virtual methods
.method public a()LHE2;
    .locals 1

    new-instance v0, Lch/qos/logback/classic/util/LogbackMDCAdapter;

    invoke-direct {v0}, Lch/qos/logback/classic/util/LogbackMDCAdapter;-><init>()V

    return-object v0
.end method
