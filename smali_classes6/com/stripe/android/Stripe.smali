.class public final Lcom/stripe/android/Stripe;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/Stripe$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a4\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u0000 \u008c\u00012\u00020\u0001:\u0002\u008c\u0001B=\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\u000cB1\u0008\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\u000fB)\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0012B5\u0008\u0000\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u0010!\u001a\u00020\"2\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J2\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020,0+H\u0007J$\u0010-\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010&\u001a\u00020\'2\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J$\u0010-\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u0010&\u001a\u00020\'2\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u001e\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010&\u001a\u00020\'2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u0005H\u0007J$\u00101\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u00102\u001a\u0002032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J$\u00101\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u00102\u001a\u0002032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u001e\u00104\u001a\u0004\u0018\u0001052\u0006\u00102\u001a\u0002032\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u0005H\u0007J*\u00106\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\'2\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u0002070+H\u0007J6\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020:2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020;0+H\u0007J*\u0010<\u001a\u0004\u0018\u00010;2\u0006\u00109\u001a\u00020:2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020?2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020;0+H\u0007J*\u0010@\u001a\u0004\u0018\u00010;2\u0006\u0010>\u001a\u00020?2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010A\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020C2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020;0+H\u0007J*\u0010D\u001a\u0004\u0018\u00010;2\u0006\u0010B\u001a\u00020C2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J8\u0010E\u001a\u00020\u001e2\u0008\u0008\u0001\u0010F\u001a\u00020\u00052\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020;0+H\u0007J*\u0010G\u001a\u0004\u0018\u00010;2\u0006\u0010F\u001a\u00020\u00052\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010H\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020J2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020K0+H\u0007J(\u0010L\u001a\u00020K2\u0006\u0010I\u001a\u00020J2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010M\u001a\u00020\u001e2\u0006\u0010N\u001a\u00020O2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020P0+H\u0007J*\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010N\u001a\u00020O2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010R\u001a\u00020\u001e2\u0006\u0010S\u001a\u00020T2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020;0+H\u0007J*\u0010U\u001a\u0004\u0018\u00010;2\u0006\u0010S\u001a\u00020T2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010V\u001a\u00020\u001e2\u0006\u0010W\u001a\u00020\u00052\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020;0+H\u0007J*\u0010X\u001a\u0004\u0018\u00010;2\u0006\u0010W\u001a\u00020\u00052\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\"\u0010Y\u001a\u00020\u001e2\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020Z0+H\u0007J6\u0010[\u001a\u00020\u001e2\u0006\u0010\\\u001a\u00020]2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\"0+H\u0007J*\u0010^\u001a\u0004\u0018\u00010\"2\u0006\u0010S\u001a\u00020]2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J4\u0010_\u001a\u00020\u001e2\u0006\u0010`\u001a\u00020a2\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00052\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020;0+H\u0002J:\u0010b\u001a\u00020\u001e\"\u0008\u0008\u0000\u0010c*\u00020d2\u000c\u0010e\u001a\u0008\u0012\u0004\u0012\u0002Hc0f2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u0002Hc0+H\u0082@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010gJH\u0010h\u001a\u00020\u001e\"\u0008\u0008\u0000\u0010c*\u00020d2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u0002Hc0+2\u001e\u0010i\u001a\u001a\u0008\u0001\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001Hc0k\u0012\u0006\u0012\u0004\u0018\u00010\u00010jH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010lJ$\u0010m\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010n\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J$\u0010m\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u0010n\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J$\u0010o\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010n\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J$\u0010o\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u0010n\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u0018\u0010p\u001a\u00020\u00082\u0006\u0010q\u001a\u00020r2\u0008\u0010s\u001a\u0004\u0018\u00010tJ\u0018\u0010u\u001a\u00020\u00082\u0006\u0010q\u001a\u00020r2\u0008\u0010s\u001a\u0004\u0018\u00010tJ\u0018\u0010v\u001a\u00020\u00082\u0006\u0010q\u001a\u00020r2\u0008\u0010s\u001a\u0004\u0018\u00010tJ\u001c\u0010w\u001a\u00020\u001e2\u0006\u0010s\u001a\u00020t2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\"0+J(\u0010x\u001a\u00020\u00082\u0006\u0010q\u001a\u00020r2\u0008\u0010s\u001a\u0004\u0018\u00010t2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020,0+H\u0007J(\u0010y\u001a\u00020\u00082\u0006\u0010q\u001a\u00020r2\u0008\u0010s\u001a\u0004\u0018\u00010t2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020z0+H\u0007J:\u0010{\u001a\u00020\u001e2\u0006\u0010n\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0008\u0002\u0010|\u001a\u0008\u0012\u0004\u0012\u00020\u00050}2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020/0+H\u0007J.\u0010~\u001a\u0004\u0018\u00010/2\u0006\u0010n\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0008\u0002\u0010|\u001a\u0008\u0012\u0004\u0012\u00020\u00050}H\u0007J\u001e\u0010\u007f\u001a\u00020\u001e2\u0007\u0010\u0080\u0001\u001a\u00020\u00052\r\u0010*\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010+J;\u0010\u0082\u0001\u001a\u00020\u001e2\u0006\u0010n\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0008\u0002\u0010|\u001a\u0008\u0012\u0004\u0012\u00020\u00050}2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u0002050+H\u0007J/\u0010\u0083\u0001\u001a\u0004\u0018\u0001052\u0006\u0010n\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0008\u0002\u0010|\u001a\u0008\u0012\u0004\u0012\u00020\u00050}H\u0007J8\u0010\u0084\u0001\u001a\u00020\u001e2\t\u0008\u0001\u0010\u0085\u0001\u001a\u00020\u00052\u0008\u0008\u0001\u0010n\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\"0+H\u0007J,\u0010\u0086\u0001\u001a\u0004\u0018\u00010\"2\t\u0008\u0001\u0010\u0085\u0001\u001a\u00020\u00052\u0008\u0008\u0001\u0010n\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J1\u0010\u0087\u0001\u001a\u00020\u001e2\u0006\u0010n\u001a\u00020\u00052\u0007\u0010\u0088\u0001\u001a\u00020r2\u0007\u0010\u0089\u0001\u001a\u00020r2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020/0+H\u0007J(\u0010\u0087\u0001\u001a\u00020\u001e2\u0006\u0010n\u001a\u00020\u00052\u0007\u0010\u008a\u0001\u001a\u00020\u00052\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020/0+H\u0007J1\u0010\u008b\u0001\u001a\u00020\u001e2\u0006\u0010n\u001a\u00020\u00052\u0007\u0010\u0088\u0001\u001a\u00020r2\u0007\u0010\u0089\u0001\u001a\u00020r2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u0002050+H\u0007J(\u0010\u008b\u0001\u001a\u00020\u001e2\u0006\u0010n\u001a\u00020\u00052\u0007\u0010\u008a\u0001\u001a\u00020\u00052\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u0002050+H\u0007R\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0019R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u008d\u0001"
    }
    d2 = {
        "Lcom/stripe/android/Stripe;",
        "",
        "context",
        "Landroid/content/Context;",
        "publishableKey",
        "",
        "stripeAccountId",
        "enableLogging",
        "",
        "betas",
        "",
        "Lcom/stripe/android/StripeApiBeta;",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;)V",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Ljava/lang/String;Z)V",
        "paymentController",
        "Lcom/stripe/android/PaymentController;",
        "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Ljava/lang/String;Ljava/lang/String;)V",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V",
        "getPaymentController$payments_core_release",
        "()Lcom/stripe/android/PaymentController;",
        "getPublishableKey$payments_core_release",
        "()Ljava/lang/String;",
        "getStripeAccountId$payments_core_release",
        "getStripeRepository$payments_core_release",
        "()Lcom/stripe/android/networking/StripeRepository;",
        "authenticateSource",
        "",
        "activity",
        "Landroidx/activity/ComponentActivity;",
        "source",
        "Lcom/stripe/android/model/Source;",
        "fragment",
        "Landroidx/fragment/app/Fragment;",
        "confirmAlipayPayment",
        "confirmPaymentIntentParams",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
        "authenticator",
        "Lcom/stripe/android/AlipayAuthenticator;",
        "callback",
        "Lcom/stripe/android/ApiResultCallback;",
        "Lcom/stripe/android/PaymentIntentResult;",
        "confirmPayment",
        "confirmPaymentIntentSynchronous",
        "Lcom/stripe/android/model/PaymentIntent;",
        "idempotencyKey",
        "confirmSetupIntent",
        "confirmSetupIntentParams",
        "Lcom/stripe/android/model/ConfirmSetupIntentParams;",
        "confirmSetupIntentSynchronous",
        "Lcom/stripe/android/model/SetupIntent;",
        "confirmWeChatPayPayment",
        "Lcom/stripe/android/model/WeChatPayNextAction;",
        "createAccountToken",
        "accountParams",
        "Lcom/stripe/android/model/AccountParams;",
        "Lcom/stripe/android/model/Token;",
        "createAccountTokenSynchronous",
        "createBankAccountToken",
        "bankAccountTokenParams",
        "Lcom/stripe/android/model/BankAccountTokenParams;",
        "createBankAccountTokenSynchronous",
        "createCardToken",
        "cardParams",
        "Lcom/stripe/android/model/CardParams;",
        "createCardTokenSynchronous",
        "createCvcUpdateToken",
        "cvc",
        "createCvcUpdateTokenSynchronous",
        "createFile",
        "fileParams",
        "Lcom/stripe/android/core/model/StripeFileParams;",
        "Lcom/stripe/android/core/model/StripeFile;",
        "createFileSynchronous",
        "createPaymentMethod",
        "paymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "Lcom/stripe/android/model/PaymentMethod;",
        "createPaymentMethodSynchronous",
        "createPersonToken",
        "params",
        "Lcom/stripe/android/model/PersonTokenParams;",
        "createPersonTokenSynchronous",
        "createPiiToken",
        "personalId",
        "createPiiTokenSynchronous",
        "createRadarSession",
        "Lcom/stripe/android/model/RadarSession;",
        "createSource",
        "sourceParams",
        "Lcom/stripe/android/model/SourceParams;",
        "createSourceSynchronous",
        "createToken",
        "tokenParams",
        "Lcom/stripe/android/model/TokenParams;",
        "dispatchResult",
        "T",
        "Lcom/stripe/android/core/model/StripeModel;",
        "result",
        "Lkotlin/Result;",
        "(Ljava/lang/Object;Lcom/stripe/android/ApiResultCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "executeAsync",
        "apiMethod",
        "Lkotlin/Function1;",
        "Lkotlin/coroutines/Continuation;",
        "(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V",
        "handleNextActionForPayment",
        "clientSecret",
        "handleNextActionForSetupIntent",
        "isAuthenticateSourceResult",
        "requestCode",
        "",
        "data",
        "Landroid/content/Intent;",
        "isPaymentResult",
        "isSetupResult",
        "onAuthenticateSourceResult",
        "onPaymentResult",
        "onSetupResult",
        "Lcom/stripe/android/SetupIntentResult;",
        "retrievePaymentIntent",
        "expand",
        "",
        "retrievePaymentIntentSynchronous",
        "retrievePossibleBrands",
        "cardNumber",
        "Lcom/stripe/android/model/PossibleBrands;",
        "retrieveSetupIntent",
        "retrieveSetupIntentSynchronous",
        "retrieveSource",
        "sourceId",
        "retrieveSourceSynchronous",
        "verifyPaymentIntentWithMicrodeposits",
        "firstAmount",
        "secondAmount",
        "descriptorCode",
        "verifySetupIntentWithMicrodeposits",
        "Companion",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final API_VERSION:Ljava/lang/String;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/Stripe$Companion;

.field public static final VERSION:Ljava/lang/String; = "AndroidBindings/20.21.0"

.field public static final VERSION_NAME:Ljava/lang/String; = "20.21.0"

.field private static advancedFraudSignalsEnabled:Z

.field private static appInfo:Lcom/stripe/android/core/AppInfo;


# instance fields
.field private final paymentController:Lcom/stripe/android/PaymentController;

.field private final publishableKey:Ljava/lang/String;

.field private final stripeAccountId:Ljava/lang/String;

.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/Stripe$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/Stripe$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/Stripe;->Companion:Lcom/stripe/android/Stripe$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/Stripe;->$stable:I

    sget-object v0, Lcom/stripe/android/core/ApiVersion;->Companion:Lcom/stripe/android/core/ApiVersion$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/core/ApiVersion$Companion;->get()Lcom/stripe/android/core/ApiVersion;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/core/ApiVersion;->getCode()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/Stripe;->API_VERSION:Ljava/lang/String;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/stripe/android/Stripe;->advancedFraudSignalsEnabled:Z

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 14

    move-object/from16 v0, p3

    new-instance v13, Lcom/stripe/android/StripePaymentController;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v1, "context.applicationContext"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/stripe/android/Stripe$2;

    invoke-direct {v3, v0}, Lcom/stripe/android/Stripe$2;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x1f0

    const/4 v12, 0x0

    move-object v1, v13

    move-object/from16 v4, p2

    move/from16 v5, p5

    invoke-direct/range {v1 .. v12}, Lcom/stripe/android/StripePaymentController;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;ZLkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/AlipayRepository;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    invoke-direct {p0, v2, v13, v0, v3}, Lcom/stripe/android/Stripe;-><init>(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 9
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x1c

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/Stripe;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/Stripe;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 9
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/Stripe;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/Set<",
            "+",
            "Lcom/stripe/android/StripeApiBeta;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v0, p2

    move-object/from16 v14, p5

    const-string v1, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "publishableKey"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "betas"

    move-object/from16 v3, p5

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v15

    const-string v3, "context.applicationContext"

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v19, Lcom/stripe/android/networking/StripeApiRepository;

    move-object/from16 v1, v19

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    move-object v2, v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lcom/stripe/android/Stripe$1;

    move-object v3, v4

    invoke-direct {v4, v0}, Lcom/stripe/android/Stripe$1;-><init>(Ljava/lang/String;)V

    sget-object v4, Lcom/stripe/android/Stripe;->appInfo:Lcom/stripe/android/core/AppInfo;

    sget-object v5, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    move/from16 v13, p4

    invoke-virtual {v5, v13}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    move-object/from16 v13, v16

    move-object/from16 v20, v15

    move-object/from16 v15, v16

    const/16 v17, 0x6ff0

    const/16 v18, 0x0

    invoke-direct/range {v1 .. v18}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, Lcom/stripe/android/core/ApiKeyValidator;->Companion:Lcom/stripe/android/core/ApiKeyValidator$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/core/ApiKeyValidator$Companion;->get()Lcom/stripe/android/core/ApiKeyValidator;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/stripe/android/core/ApiKeyValidator;->requireValid(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v2, p0

    move-object/from16 v3, v20

    move-object/from16 v4, v19

    move-object/from16 v6, p3

    move/from16 v7, p4

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/Stripe;-><init>(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    move v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p5

    :cond_2
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/Stripe;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT41;->b()LSC0;

    move-result-object v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe;-><init>(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/Stripe;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    iput-object p2, p0, Lcom/stripe/android/Stripe;->paymentController:Lcom/stripe/android/PaymentController;

    iput-object p4, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/Stripe;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance p1, Lcom/stripe/android/core/ApiKeyValidator;

    invoke-direct {p1}, Lcom/stripe/android/core/ApiKeyValidator;-><init>()V

    invoke-virtual {p1, p3}, Lcom/stripe/android/core/ApiKeyValidator;->requireValid(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/Stripe;->publishableKey:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    invoke-static {}, LT41;->b()LSC0;

    move-result-object p5

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/Stripe;-><init>(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V

    return-void
.end method

.method public static final synthetic access$dispatchResult(Lcom/stripe/android/Stripe;Ljava/lang/Object;Lcom/stripe/android/ApiResultCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->dispatchResult(Ljava/lang/Object;Lcom/stripe/android/ApiResultCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAdvancedFraudSignalsEnabled$cp()Z
    .locals 1

    sget-boolean v0, Lcom/stripe/android/Stripe;->advancedFraudSignalsEnabled:Z

    return v0
.end method

.method public static final synthetic access$getAppInfo$cp()Lcom/stripe/android/core/AppInfo;
    .locals 1

    sget-object v0, Lcom/stripe/android/Stripe;->appInfo:Lcom/stripe/android/core/AppInfo;

    return-object v0
.end method

.method public static final synthetic access$setAdvancedFraudSignalsEnabled$cp(Z)V
    .locals 0

    sput-boolean p0, Lcom/stripe/android/Stripe;->advancedFraudSignalsEnabled:Z

    return-void
.end method

.method public static final synthetic access$setAppInfo$cp(Lcom/stripe/android/core/AppInfo;)V
    .locals 0

    sput-object p0, Lcom/stripe/android/Stripe;->appInfo:Lcom/stripe/android/core/AppInfo;

    return-void
.end method

.method public static synthetic authenticateSource$default(Lcom/stripe/android/Stripe;Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/Source;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->authenticateSource(Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/Source;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic authenticateSource$default(Lcom/stripe/android/Stripe;Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/Source;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->authenticateSource(Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/Source;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic confirmAlipayPayment$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/Stripe;->confirmAlipayPayment(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public static synthetic confirmPayment$default(Lcom/stripe/android/Stripe;Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->confirmPayment(Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic confirmPayment$default(Lcom/stripe/android/Stripe;Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->confirmPayment(Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic confirmPaymentIntentSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentIntent;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/Stripe;->confirmPaymentIntentSynchronous(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;)Lcom/stripe/android/model/PaymentIntent;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic confirmSetupIntent$default(Lcom/stripe/android/Stripe;Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->confirmSetupIntent(Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic confirmSetupIntent$default(Lcom/stripe/android/Stripe;Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->confirmSetupIntent(Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic confirmSetupIntentSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/SetupIntent;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/Stripe;->confirmSetupIntentSynchronous(Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;)Lcom/stripe/android/model/SetupIntent;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic confirmWeChatPayPayment$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    iget-object p2, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->confirmWeChatPayPayment(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public static synthetic createAccountToken$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/AccountParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/Stripe;->createAccountToken(Lcom/stripe/android/model/AccountParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public static synthetic createAccountTokenSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/AccountParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Token;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->createAccountTokenSynchronous(Lcom/stripe/android/model/AccountParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createBankAccountToken$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/BankAccountTokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/Stripe;->createBankAccountToken(Lcom/stripe/android/model/BankAccountTokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public static synthetic createBankAccountTokenSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/BankAccountTokenParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Token;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->createBankAccountTokenSynchronous(Lcom/stripe/android/model/BankAccountTokenParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createCardToken$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/CardParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/Stripe;->createCardToken(Lcom/stripe/android/model/CardParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public static synthetic createCardTokenSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/CardParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Token;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->createCardTokenSynchronous(Lcom/stripe/android/model/CardParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createCvcUpdateToken$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/Stripe;->createCvcUpdateToken(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public static synthetic createCvcUpdateTokenSynchronous$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Token;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->createCvcUpdateTokenSynchronous(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createFile$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/core/model/StripeFileParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/Stripe;->createFile(Lcom/stripe/android/core/model/StripeFileParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public static synthetic createFileSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/core/model/StripeFileParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/model/StripeFile;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->createFileSynchronous(Lcom/stripe/android/core/model/StripeFileParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/core/model/StripeFile;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createPaymentMethod$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/Stripe;->createPaymentMethod(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public static synthetic createPaymentMethodSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethod;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;
        }
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->createPaymentMethodSynchronous(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createPersonToken$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PersonTokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/Stripe;->createPersonToken(Lcom/stripe/android/model/PersonTokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public static synthetic createPersonTokenSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PersonTokenParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Token;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->createPersonTokenSynchronous(Lcom/stripe/android/model/PersonTokenParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createPiiToken$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/Stripe;->createPiiToken(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public static synthetic createPiiTokenSynchronous$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Token;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->createPiiTokenSynchronous(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createRadarSession$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget-object p1, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/Stripe;->createRadarSession(Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public static synthetic createSource$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/Stripe;->createSource(Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public static synthetic createSourceSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Source;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->createSourceSynchronous(Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Source;

    move-result-object p0

    return-object p0
.end method

.method private final createToken(Lcom/stripe/android/model/TokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/TokenParams;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)V"
        }
    .end annotation

    new-instance v6, Lcom/stripe/android/Stripe$createToken$1;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/Stripe$createToken$1;-><init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/TokenParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    invoke-direct {p0, p4, v6}, Lcom/stripe/android/Stripe;->executeAsync(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic createToken$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/TokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/Stripe;->createToken(Lcom/stripe/android/model/TokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method private final dispatchResult(Ljava/lang/Object;Lcom/stripe/android/ApiResultCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/stripe/android/core/model/StripeModel;",
            ">(",
            "Ljava/lang/Object;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {}, LT41;->c()LpG2;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/Stripe$dispatchResult$2;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lcom/stripe/android/Stripe$dispatchResult$2;-><init>(Ljava/lang/Object;Lcom/stripe/android/ApiResultCallback;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, p3}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final executeAsync(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/stripe/android/core/model/StripeModel;",
            ">(",
            "Lcom/stripe/android/ApiResultCallback<",
            "-TT;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/Stripe;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, LaD0;->a(Lkotlin/coroutines/CoroutineContext;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/Stripe$executeAsync$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, p2, v0}, Lcom/stripe/android/Stripe$executeAsync$1;-><init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public static final getAdvancedFraudSignalsEnabled()Z
    .locals 1

    sget-object v0, Lcom/stripe/android/Stripe;->Companion:Lcom/stripe/android/Stripe$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/Stripe$Companion;->getAdvancedFraudSignalsEnabled()Z

    move-result v0

    return v0
.end method

.method public static final getAppInfo()Lcom/stripe/android/core/AppInfo;
    .locals 1

    sget-object v0, Lcom/stripe/android/Stripe;->Companion:Lcom/stripe/android/Stripe$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/Stripe$Companion;->getAppInfo()Lcom/stripe/android/core/AppInfo;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic handleNextActionForPayment$default(Lcom/stripe/android/Stripe;Landroidx/activity/ComponentActivity;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->handleNextActionForPayment(Landroidx/activity/ComponentActivity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic handleNextActionForPayment$default(Lcom/stripe/android/Stripe;Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->handleNextActionForPayment(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic handleNextActionForSetupIntent$default(Lcom/stripe/android/Stripe;Landroidx/activity/ComponentActivity;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->handleNextActionForSetupIntent(Landroidx/activity/ComponentActivity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic handleNextActionForSetupIntent$default(Lcom/stripe/android/Stripe;Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->handleNextActionForSetupIntent(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic retrievePaymentIntent$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    iget-object p2, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p3

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/Stripe;->retrievePaymentIntent(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public static synthetic retrievePaymentIntentSynchronous$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentIntent;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;
        }
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    iget-object p2, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p3

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->retrievePaymentIntentSynchronous(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/stripe/android/model/PaymentIntent;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic retrieveSetupIntent$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;
        }
    .end annotation

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    iget-object p2, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p3

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/Stripe;->retrieveSetupIntent(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public static synthetic retrieveSetupIntentSynchronous$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/model/SetupIntent;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;
        }
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    iget-object p2, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p3

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->retrieveSetupIntentSynchronous(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/stripe/android/model/SetupIntent;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic retrieveSource$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/Stripe;->retrieveSource(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public static synthetic retrieveSourceSynchronous$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Source;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    iget-object p3, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/Stripe;->retrieveSourceSynchronous(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Source;

    move-result-object p0

    return-object p0
.end method

.method public static final setAdvancedFraudSignalsEnabled(Z)V
    .locals 1

    sget-object v0, Lcom/stripe/android/Stripe;->Companion:Lcom/stripe/android/Stripe$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/Stripe$Companion;->setAdvancedFraudSignalsEnabled(Z)V

    return-void
.end method

.method public static final setAppInfo(Lcom/stripe/android/core/AppInfo;)V
    .locals 1

    sget-object v0, Lcom/stripe/android/Stripe;->Companion:Lcom/stripe/android/Stripe$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/Stripe$Companion;->setAppInfo(Lcom/stripe/android/core/AppInfo;)V

    return-void
.end method


# virtual methods
.method public final authenticateSource(Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/Source;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->authenticateSource$default(Lcom/stripe/android/Stripe;Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/Source;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public final authenticateSource(Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/Source;Ljava/lang/String;)V
    .locals 10
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcom/stripe/android/Stripe$authenticateSource$1;

    const/4 v9, 0x0

    move-object v4, v0

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/Stripe$authenticateSource$1;-><init>(Lcom/stripe/android/Stripe;Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/Source;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final authenticateSource(Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/Source;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->authenticateSource$default(Lcom/stripe/android/Stripe;Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/Source;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public final authenticateSource(Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/Source;Ljava/lang/String;)V
    .locals 8
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v0

    new-instance v7, Lcom/stripe/android/Stripe$authenticateSource$2;

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$authenticateSource$2;-><init>(Lcom/stripe/android/Stripe;Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/Source;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {v0, v7}, Lzq2;->b(Lkotlin/jvm/functions/Function2;)Lzh2;

    return-void
.end method

.method public final confirmAlipayPayment(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
            "Lcom/stripe/android/AlipayAuthenticator;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/PaymentIntentResult;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "confirmPaymentIntentParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authenticator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->confirmAlipayPayment$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final confirmAlipayPayment(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
            "Lcom/stripe/android/AlipayAuthenticator;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/PaymentIntentResult;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "confirmPaymentIntentParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authenticator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$confirmAlipayPayment$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$confirmAlipayPayment$1;-><init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    invoke-direct {p0, p4, v0}, Lcom/stripe/android/Stripe;->executeAsync(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final confirmPayment(Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/ConfirmPaymentIntentParams;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmPaymentIntentParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->confirmPayment$default(Lcom/stripe/android/Stripe;Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public final confirmPayment(Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;)V
    .locals 10
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmPaymentIntentParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcom/stripe/android/Stripe$confirmPayment$1;

    const/4 v9, 0x0

    move-object v4, v0

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/Stripe$confirmPayment$1;-><init>(Lcom/stripe/android/Stripe;Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final confirmPayment(Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/ConfirmPaymentIntentParams;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmPaymentIntentParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->confirmPayment$default(Lcom/stripe/android/Stripe;Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public final confirmPayment(Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;)V
    .locals 10
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmPaymentIntentParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcom/stripe/android/Stripe$confirmPayment$2;

    const/4 v9, 0x0

    move-object v4, v0

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/Stripe$confirmPayment$2;-><init>(Lcom/stripe/android/Stripe;Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final confirmPaymentIntentSynchronous(Lcom/stripe/android/model/ConfirmPaymentIntentParams;)Lcom/stripe/android/model/PaymentIntent;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "use {@link #confirmPayment(Activity, ConfirmPaymentIntentParams)}"
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "confirmPaymentIntentParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lcom/stripe/android/Stripe;->confirmPaymentIntentSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentIntent;

    move-result-object p1

    return-object p1
.end method

.method public final confirmPaymentIntentSynchronous(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;)Lcom/stripe/android/model/PaymentIntent;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "use {@link #confirmPayment(Activity, ConfirmPaymentIntentParams)}"
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "confirmPaymentIntentParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$confirmPaymentIntentSynchronous$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/stripe/android/Stripe$confirmPaymentIntentSynchronous$1;-><init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 p1, 0x1

    invoke-static {v1, v0, p1, v1}, LX30;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/PaymentIntent;

    return-object p1
.end method

.method public final confirmSetupIntent(Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/ConfirmSetupIntentParams;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmSetupIntentParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->confirmSetupIntent$default(Lcom/stripe/android/Stripe;Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public final confirmSetupIntent(Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;)V
    .locals 10
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmSetupIntentParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcom/stripe/android/Stripe$confirmSetupIntent$1;

    const/4 v9, 0x0

    move-object v4, v0

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/Stripe$confirmSetupIntent$1;-><init>(Lcom/stripe/android/Stripe;Landroidx/activity/ComponentActivity;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final confirmSetupIntent(Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/ConfirmSetupIntentParams;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmSetupIntentParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->confirmSetupIntent$default(Lcom/stripe/android/Stripe;Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public final confirmSetupIntent(Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;)V
    .locals 10
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmSetupIntentParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcom/stripe/android/Stripe$confirmSetupIntent$2;

    const/4 v9, 0x0

    move-object v4, v0

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/Stripe$confirmSetupIntent$2;-><init>(Lcom/stripe/android/Stripe;Landroidx/fragment/app/Fragment;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final confirmSetupIntentSynchronous(Lcom/stripe/android/model/ConfirmSetupIntentParams;)Lcom/stripe/android/model/SetupIntent;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "use {@link #confirmSetupIntent(Activity, ConfirmSetupIntentParams)}"
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "confirmSetupIntentParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lcom/stripe/android/Stripe;->confirmSetupIntentSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/SetupIntent;

    move-result-object p1

    return-object p1
.end method

.method public final confirmSetupIntentSynchronous(Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;)Lcom/stripe/android/model/SetupIntent;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "use {@link #confirmSetupIntent(Activity, ConfirmSetupIntentParams)}"
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "confirmSetupIntentParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$confirmSetupIntentSynchronous$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/stripe/android/Stripe$confirmSetupIntentSynchronous$1;-><init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 p1, 0x1

    invoke-static {v1, v0, p1, v1}, LX30;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/SetupIntent;

    return-object p1
.end method

.method public final confirmWeChatPayPayment(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/ApiResultCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/WeChatPayNextAction;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Use the WeChat Pay module instead."
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "confirmPaymentIntentParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->confirmWeChatPayPayment$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final confirmWeChatPayPayment(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/WeChatPayNextAction;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Use the WeChat Pay module instead."
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "confirmPaymentIntentParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$confirmWeChatPayPayment$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/stripe/android/Stripe$confirmWeChatPayPayment$1;-><init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    invoke-direct {p0, p3, v0}, Lcom/stripe/android/Stripe;->executeAsync(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final createAccountToken(Lcom/stripe/android/model/AccountParams;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/AccountParams;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "accountParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->createAccountToken$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/AccountParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final createAccountToken(Lcom/stripe/android/model/AccountParams;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/AccountParams;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "accountParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->createAccountToken$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/AccountParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final createAccountToken(Lcom/stripe/android/model/AccountParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/AccountParams;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "accountParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p3, p2, p4}, Lcom/stripe/android/Stripe;->createToken(Lcom/stripe/android/model/TokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public final createAccountTokenSynchronous(Lcom/stripe/android/model/AccountParams;)Lcom/stripe/android/model/Token;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "accountParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->createAccountTokenSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/AccountParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Token;

    move-result-object p1

    return-object p1
.end method

.method public final createAccountTokenSynchronous(Lcom/stripe/android/model/AccountParams;Ljava/lang/String;)Lcom/stripe/android/model/Token;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "accountParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->createAccountTokenSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/AccountParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Token;

    move-result-object p1

    return-object p1
.end method

.method public final createAccountTokenSynchronous(Lcom/stripe/android/model/AccountParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "accountParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    new-instance v7, Lcom/stripe/android/Stripe$createAccountTokenSynchronous$1;

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$createAccountTokenSynchronous$1;-><init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/AccountParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 p1, 0x1

    invoke-static {v0, v7, p1, v0}, LX30;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/Token;
    :try_end_0
    .catch Lcom/stripe/android/exception/CardException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, p1

    :catch_0
    return-object v0
.end method

.method public final createBankAccountToken(Lcom/stripe/android/model/BankAccountTokenParams;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/BankAccountTokenParams;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "bankAccountTokenParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->createBankAccountToken$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/BankAccountTokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final createBankAccountToken(Lcom/stripe/android/model/BankAccountTokenParams;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/BankAccountTokenParams;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "bankAccountTokenParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->createBankAccountToken$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/BankAccountTokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final createBankAccountToken(Lcom/stripe/android/model/BankAccountTokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/BankAccountTokenParams;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "bankAccountTokenParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p3, p2, p4}, Lcom/stripe/android/Stripe;->createToken(Lcom/stripe/android/model/TokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public final createBankAccountTokenSynchronous(Lcom/stripe/android/model/BankAccountTokenParams;)Lcom/stripe/android/model/Token;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "bankAccountTokenParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->createBankAccountTokenSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/BankAccountTokenParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Token;

    move-result-object p1

    return-object p1
.end method

.method public final createBankAccountTokenSynchronous(Lcom/stripe/android/model/BankAccountTokenParams;Ljava/lang/String;)Lcom/stripe/android/model/Token;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "bankAccountTokenParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->createBankAccountTokenSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/BankAccountTokenParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Token;

    move-result-object p1

    return-object p1
.end method

.method public final createBankAccountTokenSynchronous(Lcom/stripe/android/model/BankAccountTokenParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "bankAccountTokenParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$createBankAccountTokenSynchronous$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$createBankAccountTokenSynchronous$1;-><init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/BankAccountTokenParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p2, v0, p1, p2}, LX30;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/Token;

    return-object p1
.end method

.method public final createCardToken(Lcom/stripe/android/model/CardParams;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/CardParams;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "cardParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->createCardToken$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/CardParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final createCardToken(Lcom/stripe/android/model/CardParams;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/CardParams;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "cardParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->createCardToken$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/CardParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final createCardToken(Lcom/stripe/android/model/CardParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/CardParams;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "cardParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p3, p2, p4}, Lcom/stripe/android/Stripe;->createToken(Lcom/stripe/android/model/TokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public final createCardTokenSynchronous(Lcom/stripe/android/model/CardParams;)Lcom/stripe/android/model/Token;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "cardParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->createCardTokenSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/CardParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Token;

    move-result-object p1

    return-object p1
.end method

.method public final createCardTokenSynchronous(Lcom/stripe/android/model/CardParams;Ljava/lang/String;)Lcom/stripe/android/model/Token;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "cardParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->createCardTokenSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/CardParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Token;

    move-result-object p1

    return-object p1
.end method

.method public final createCardTokenSynchronous(Lcom/stripe/android/model/CardParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "cardParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$createCardTokenSynchronous$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$createCardTokenSynchronous$1;-><init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/CardParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p2, v0, p1, p2}, LX30;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/Token;

    return-object p1
.end method

.method public final createCvcUpdateToken(Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "cvc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->createCvcUpdateToken$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final createCvcUpdateToken(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "cvc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->createCvcUpdateToken$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final createCvcUpdateToken(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "cvc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/model/CvcTokenParams;

    invoke-direct {v0, p1}, Lcom/stripe/android/model/CvcTokenParams;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, p3, p2, p4}, Lcom/stripe/android/Stripe;->createToken(Lcom/stripe/android/model/TokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public final createCvcUpdateTokenSynchronous(Ljava/lang/String;)Lcom/stripe/android/model/Token;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "cvc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->createCvcUpdateTokenSynchronous$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Token;

    move-result-object p1

    return-object p1
.end method

.method public final createCvcUpdateTokenSynchronous(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "cvc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->createCvcUpdateTokenSynchronous$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Token;

    move-result-object p1

    return-object p1
.end method

.method public final createCvcUpdateTokenSynchronous(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "cvc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$createCvcUpdateTokenSynchronous$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$createCvcUpdateTokenSynchronous$1;-><init>(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p2, v0, p1, p2}, LX30;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/Token;

    return-object p1
.end method

.method public final createFile(Lcom/stripe/android/core/model/StripeFileParams;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/model/StripeFileParams;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/core/model/StripeFile;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "fileParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->createFile$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/core/model/StripeFileParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final createFile(Lcom/stripe/android/core/model/StripeFileParams;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/model/StripeFileParams;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/core/model/StripeFile;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "fileParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->createFile$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/core/model/StripeFileParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final createFile(Lcom/stripe/android/core/model/StripeFileParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/model/StripeFileParams;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/core/model/StripeFile;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "fileParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$createFile$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$createFile$1;-><init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/core/model/StripeFileParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    invoke-direct {p0, p4, v0}, Lcom/stripe/android/Stripe;->executeAsync(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final createFileSynchronous(Lcom/stripe/android/core/model/StripeFileParams;)Lcom/stripe/android/core/model/StripeFile;
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "fileParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->createFileSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/core/model/StripeFileParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/model/StripeFile;

    move-result-object p1

    return-object p1
.end method

.method public final createFileSynchronous(Lcom/stripe/android/core/model/StripeFileParams;Ljava/lang/String;)Lcom/stripe/android/core/model/StripeFile;
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "fileParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->createFileSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/core/model/StripeFileParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/model/StripeFile;

    move-result-object p1

    return-object p1
.end method

.method public final createFileSynchronous(Lcom/stripe/android/core/model/StripeFileParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/core/model/StripeFile;
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "fileParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$createFileSynchronous$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$createFileSynchronous$1;-><init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/core/model/StripeFileParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p2, v0, p1, p2}, LX30;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/StripeFile;

    return-object p1
.end method

.method public final createPaymentMethod(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "paymentMethodCreateParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->createPaymentMethod$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final createPaymentMethod(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "paymentMethodCreateParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->createPaymentMethod$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final createPaymentMethod(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "paymentMethodCreateParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$createPaymentMethod$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$createPaymentMethod$1;-><init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    invoke-direct {p0, p4, v0}, Lcom/stripe/android/Stripe;->executeAsync(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final createPaymentMethodSynchronous(Lcom/stripe/android/model/PaymentMethodCreateParams;)Lcom/stripe/android/model/PaymentMethod;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "paymentMethodCreateParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->createPaymentMethodSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    return-object p1
.end method

.method public final createPaymentMethodSynchronous(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "paymentMethodCreateParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->createPaymentMethodSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    return-object p1
.end method

.method public final createPaymentMethodSynchronous(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "paymentMethodCreateParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$createPaymentMethodSynchronous$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$createPaymentMethodSynchronous$1;-><init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p2, v0, p1, p2}, LX30;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/PaymentMethod;

    return-object p1
.end method

.method public final createPersonToken(Lcom/stripe/android/model/PersonTokenParams;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PersonTokenParams;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->createPersonToken$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PersonTokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final createPersonToken(Lcom/stripe/android/model/PersonTokenParams;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PersonTokenParams;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->createPersonToken$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PersonTokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final createPersonToken(Lcom/stripe/android/model/PersonTokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PersonTokenParams;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p3, p2, p4}, Lcom/stripe/android/Stripe;->createToken(Lcom/stripe/android/model/TokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public final createPersonTokenSynchronous(Lcom/stripe/android/model/PersonTokenParams;)Lcom/stripe/android/model/Token;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->createPersonTokenSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PersonTokenParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Token;

    move-result-object p1

    return-object p1
.end method

.method public final createPersonTokenSynchronous(Lcom/stripe/android/model/PersonTokenParams;Ljava/lang/String;)Lcom/stripe/android/model/Token;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->createPersonTokenSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PersonTokenParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Token;

    move-result-object p1

    return-object p1
.end method

.method public final createPersonTokenSynchronous(Lcom/stripe/android/model/PersonTokenParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$createPersonTokenSynchronous$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$createPersonTokenSynchronous$1;-><init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PersonTokenParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p2, v0, p1, p2}, LX30;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/Token;

    return-object p1
.end method

.method public final createPiiToken(Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "personalId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->createPiiToken$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final createPiiToken(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "personalId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->createPiiToken$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final createPiiToken(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Token;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "personalId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/model/PiiTokenParams;

    invoke-direct {v0, p1}, Lcom/stripe/android/model/PiiTokenParams;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, p3, p2, p4}, Lcom/stripe/android/Stripe;->createToken(Lcom/stripe/android/model/TokenParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method public final createPiiTokenSynchronous(Ljava/lang/String;)Lcom/stripe/android/model/Token;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "personalId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->createPiiTokenSynchronous$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Token;

    move-result-object p1

    return-object p1
.end method

.method public final createPiiTokenSynchronous(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "personalId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->createPiiTokenSynchronous$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Token;

    move-result-object p1

    return-object p1
.end method

.method public final createPiiTokenSynchronous(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Token;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "personalId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$createPiiTokenSynchronous$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$createPiiTokenSynchronous$1;-><init>(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p2, v0, p1, p2}, LX30;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/Token;

    return-object p1
.end method

.method public final createRadarSession(Lcom/stripe/android/ApiResultCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/RadarSession;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, p1, v1, v0}, Lcom/stripe/android/Stripe;->createRadarSession$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final createRadarSession(Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/RadarSession;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$createRadarSession$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/stripe/android/Stripe$createRadarSession$1;-><init>(Lcom/stripe/android/Stripe;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    invoke-direct {p0, p2, v0}, Lcom/stripe/android/Stripe;->executeAsync(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final createSource(Lcom/stripe/android/model/SourceParams;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/SourceParams;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Source;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "sourceParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->createSource$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final createSource(Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/SourceParams;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Source;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "sourceParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->createSource$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final createSource(Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/SourceParams;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Source;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "sourceParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$createSource$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$createSource$1;-><init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    invoke-direct {p0, p4, v0}, Lcom/stripe/android/Stripe;->executeAsync(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final createSourceSynchronous(Lcom/stripe/android/model/SourceParams;)Lcom/stripe/android/model/Source;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->createSourceSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Source;

    move-result-object p1

    return-object p1
.end method

.method public final createSourceSynchronous(Lcom/stripe/android/model/SourceParams;Ljava/lang/String;)Lcom/stripe/android/model/Source;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->createSourceSynchronous$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Source;

    move-result-object p1

    return-object p1
.end method

.method public final createSourceSynchronous(Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Source;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$createSourceSynchronous$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$createSourceSynchronous$1;-><init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p2, v0, p1, p2}, LX30;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/Source;

    return-object p1
.end method

.method public final getPaymentController$payments_core_release()Lcom/stripe/android/PaymentController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/Stripe;->paymentController:Lcom/stripe/android/PaymentController;

    return-object v0
.end method

.method public final getPublishableKey$payments_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/Stripe;->publishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getStripeAccountId$payments_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/Stripe;->stripeAccountId:Ljava/lang/String;

    return-object v0
.end method

.method public final getStripeRepository$payments_core_release()Lcom/stripe/android/networking/StripeRepository;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/Stripe;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    return-object v0
.end method

.method public final handleNextActionForPayment(Landroidx/activity/ComponentActivity;Ljava/lang/String;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientSecret"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->handleNextActionForPayment$default(Lcom/stripe/android/Stripe;Landroidx/activity/ComponentActivity;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public final handleNextActionForPayment(Landroidx/activity/ComponentActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientSecret"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcom/stripe/android/Stripe$handleNextActionForPayment$1;

    const/4 v9, 0x0

    move-object v4, v0

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/Stripe$handleNextActionForPayment$1;-><init>(Lcom/stripe/android/Stripe;Landroidx/activity/ComponentActivity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final handleNextActionForPayment(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientSecret"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->handleNextActionForPayment$default(Lcom/stripe/android/Stripe;Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public final handleNextActionForPayment(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientSecret"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcom/stripe/android/Stripe$handleNextActionForPayment$2;

    const/4 v9, 0x0

    move-object v4, v0

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/Stripe$handleNextActionForPayment$2;-><init>(Lcom/stripe/android/Stripe;Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final handleNextActionForSetupIntent(Landroidx/activity/ComponentActivity;Ljava/lang/String;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientSecret"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->handleNextActionForSetupIntent$default(Lcom/stripe/android/Stripe;Landroidx/activity/ComponentActivity;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public final handleNextActionForSetupIntent(Landroidx/activity/ComponentActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientSecret"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcom/stripe/android/Stripe$handleNextActionForSetupIntent$1;

    const/4 v9, 0x0

    move-object v4, v0

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/Stripe$handleNextActionForSetupIntent$1;-><init>(Lcom/stripe/android/Stripe;Landroidx/activity/ComponentActivity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final handleNextActionForSetupIntent(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientSecret"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->handleNextActionForSetupIntent$default(Lcom/stripe/android/Stripe;Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public final handleNextActionForSetupIntent(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientSecret"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcom/stripe/android/Stripe$handleNextActionForSetupIntent$2;

    const/4 v9, 0x0

    move-object v4, v0

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/Stripe$handleNextActionForSetupIntent$2;-><init>(Lcom/stripe/android/Stripe;Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final isAuthenticateSourceResult(ILandroid/content/Intent;)Z
    .locals 1

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/Stripe;->paymentController:Lcom/stripe/android/PaymentController;

    invoke-interface {v0, p1, p2}, Lcom/stripe/android/PaymentController;->shouldHandleSourceResult(ILandroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final isPaymentResult(ILandroid/content/Intent;)Z
    .locals 1

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/Stripe;->paymentController:Lcom/stripe/android/PaymentController;

    invoke-interface {v0, p1, p2}, Lcom/stripe/android/PaymentController;->shouldHandlePaymentResult(ILandroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final isSetupResult(ILandroid/content/Intent;)Z
    .locals 1

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/Stripe;->paymentController:Lcom/stripe/android/PaymentController;

    invoke-interface {v0, p1, p2}, Lcom/stripe/android/PaymentController;->shouldHandleSetupResult(ILandroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final onAuthenticateSourceResult(Landroid/content/Intent;Lcom/stripe/android/ApiResultCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Source;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$onAuthenticateSourceResult$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/stripe/android/Stripe$onAuthenticateSourceResult$1;-><init>(Lcom/stripe/android/Stripe;Landroid/content/Intent;Lkotlin/coroutines/Continuation;)V

    invoke-direct {p0, p2, v0}, Lcom/stripe/android/Stripe;->executeAsync(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onPaymentResult(ILandroid/content/Intent;Lcom/stripe/android/ApiResultCallback;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/content/Intent;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/PaymentIntentResult;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/Stripe;->isPaymentResult(ILandroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lcom/stripe/android/Stripe$onPaymentResult$1;

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, v0}, Lcom/stripe/android/Stripe$onPaymentResult$1;-><init>(Lcom/stripe/android/Stripe;Landroid/content/Intent;Lkotlin/coroutines/Continuation;)V

    invoke-direct {p0, p3, p1}, Lcom/stripe/android/Stripe;->executeAsync(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final onSetupResult(ILandroid/content/Intent;Lcom/stripe/android/ApiResultCallback;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/content/Intent;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/SetupIntentResult;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/Stripe;->isSetupResult(ILandroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lcom/stripe/android/Stripe$onSetupResult$1;

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, v0}, Lcom/stripe/android/Stripe$onSetupResult$1;-><init>(Lcom/stripe/android/Stripe;Landroid/content/Intent;Lkotlin/coroutines/Continuation;)V

    invoke-direct {p0, p3, p1}, Lcom/stripe/android/Stripe;->executeAsync(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final retrievePaymentIntent(Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->retrievePaymentIntent$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final retrievePaymentIntent(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->retrievePaymentIntent$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final retrievePaymentIntent(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/ApiResultCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expand"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$retrievePaymentIntent$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$retrievePaymentIntent$1;-><init>(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    invoke-direct {p0, p4, v0}, Lcom/stripe/android/Stripe;->executeAsync(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final retrievePaymentIntentSynchronous(Ljava/lang/String;)Lcom/stripe/android/model/PaymentIntent;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->retrievePaymentIntentSynchronous$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentIntent;

    move-result-object p1

    return-object p1
.end method

.method public final retrievePaymentIntentSynchronous(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PaymentIntent;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->retrievePaymentIntentSynchronous$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentIntent;

    move-result-object p1

    return-object p1
.end method

.method public final retrievePaymentIntentSynchronous(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/stripe/android/model/PaymentIntent;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/model/PaymentIntent;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expand"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$retrievePaymentIntentSynchronous$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$retrievePaymentIntentSynchronous$1;-><init>(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p2, v0, p1, p2}, LX30;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/PaymentIntent;

    return-object p1
.end method

.method public final retrievePossibleBrands(Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/PossibleBrands;",
            ">;)V"
        }
    .end annotation

    const-string v0, "cardNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/cards/CardNumber$Unvalidated;

    invoke-direct {v0, p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getBin()Lcom/stripe/android/cards/Bin;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p1, Lcom/stripe/android/core/exception/InvalidRequestException;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "cardNumber cannot be less than 6 characters"

    const/4 v6, 0x0

    const/16 v7, 0x17

    const/4 v8, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/core/exception/InvalidRequestException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, p1}, Lcom/stripe/android/ApiResultCallback;->onError(Ljava/lang/Exception;)V

    return-void

    :cond_0
    new-instance v0, Lcom/stripe/android/Stripe$retrievePossibleBrands$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/stripe/android/Stripe$retrievePossibleBrands$2;-><init>(Lcom/stripe/android/Stripe;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    invoke-direct {p0, p2, v0}, Lcom/stripe/android/Stripe;->executeAsync(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final retrieveSetupIntent(Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->retrieveSetupIntent$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final retrieveSetupIntent(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->retrieveSetupIntent$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final retrieveSetupIntent(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/ApiResultCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expand"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$retrieveSetupIntent$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$retrieveSetupIntent$1;-><init>(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    invoke-direct {p0, p4, v0}, Lcom/stripe/android/Stripe;->executeAsync(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final retrieveSetupIntentSynchronous(Ljava/lang/String;)Lcom/stripe/android/model/SetupIntent;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->retrieveSetupIntentSynchronous$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/model/SetupIntent;

    move-result-object p1

    return-object p1
.end method

.method public final retrieveSetupIntentSynchronous(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/SetupIntent;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->retrieveSetupIntentSynchronous$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/model/SetupIntent;

    move-result-object p1

    return-object p1
.end method

.method public final retrieveSetupIntentSynchronous(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/stripe/android/model/SetupIntent;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/model/SetupIntent;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expand"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$retrieveSetupIntentSynchronous$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$retrieveSetupIntentSynchronous$1;-><init>(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p2, v0, p1, p2}, LX30;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/SetupIntent;

    return-object p1
.end method

.method public final retrieveSource(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Source;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientSecret"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->retrieveSource$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final retrieveSource(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/Source;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientSecret"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$retrieveSource$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$retrieveSource$1;-><init>(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    invoke-direct {p0, p4, v0}, Lcom/stripe/android/Stripe;->executeAsync(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final retrieveSourceSynchronous(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Source;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientSecret"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/Stripe;->retrieveSourceSynchronous$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Source;

    move-result-object p1

    return-object p1
.end method

.method public final retrieveSourceSynchronous(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Source;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientSecret"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$retrieveSourceSynchronous$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$retrieveSourceSynchronous$1;-><init>(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p2, v0, p1, p2}, LX30;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/Source;

    return-object p1
.end method

.method public final verifyPaymentIntentWithMicrodeposits(Ljava/lang/String;IILcom/stripe/android/ApiResultCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$verifyPaymentIntentWithMicrodeposits$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$verifyPaymentIntentWithMicrodeposits$1;-><init>(Lcom/stripe/android/Stripe;Ljava/lang/String;IILkotlin/coroutines/Continuation;)V

    invoke-direct {p0, p4, v0}, Lcom/stripe/android/Stripe;->executeAsync(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final verifyPaymentIntentWithMicrodeposits(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptorCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$verifyPaymentIntentWithMicrodeposits$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/stripe/android/Stripe$verifyPaymentIntentWithMicrodeposits$2;-><init>(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    invoke-direct {p0, p3, v0}, Lcom/stripe/android/Stripe;->executeAsync(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final verifySetupIntentWithMicrodeposits(Ljava/lang/String;IILcom/stripe/android/ApiResultCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$verifySetupIntentWithMicrodeposits$1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/Stripe$verifySetupIntentWithMicrodeposits$1;-><init>(Lcom/stripe/android/Stripe;Ljava/lang/String;IILkotlin/coroutines/Continuation;)V

    invoke-direct {p0, p4, v0}, Lcom/stripe/android/Stripe;->executeAsync(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final verifySetupIntentWithMicrodeposits(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ApiResultCallback<",
            "-",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptorCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/Stripe$verifySetupIntentWithMicrodeposits$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/stripe/android/Stripe$verifySetupIntentWithMicrodeposits$2;-><init>(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    invoke-direct {p0, p3, v0}, Lcom/stripe/android/Stripe;->executeAsync(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
